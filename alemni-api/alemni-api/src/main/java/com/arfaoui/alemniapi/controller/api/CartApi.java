package com.arfaoui.alemniapi.controller.api;

import com.arfaoui.alemniapi.dto.CartDto;
import com.arfaoui.alemniapi.dto.CartLineDto;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

import static com.arfaoui.alemniapi.utils.Constants.APP_ROOT;

@Api("cart")
public interface CartApi {
    @PostMapping(APP_ROOT + "/Cart/create")
    ResponseEntity<CartDto> save(@RequestBody CartDto dto);
    
    @PatchMapping(APP_ROOT + "/cart/update/quantity/{idCart}/{idLineCart}/{quantity}")
    ResponseEntity<CartDto> updateQuantityCart(@PathVariable("idCart") Long idCart,
                                                 @PathVariable("idLineCart") Long idLineCart, @PathVariable("quantity") BigDecimal quantity);

    @PatchMapping(APP_ROOT + "/cart/update/{idCart}/{id}")
    ResponseEntity<CartDto> update(@PathVariable("idCart") Long idCart, @PathVariable("id") Long id);

    @PatchMapping(APP_ROOT + "/cart/update/course/{idCart}/{idLineCart}/{idCourse}")
    ResponseEntity<CartDto> updateCourse(@PathVariable("idCart") Long idCart,
                                          @PathVariable("idLineCart") Long idLineCart, @PathVariable("idCourse") Long idCourse);

    @DeleteMapping(APP_ROOT + "/cart/delete/course/{idCart}/{idLineCart}")
    ResponseEntity<CartDto> deleteCourse(@PathVariable("idCart") Long idCart, @PathVariable("idLineCart") Long idLineCart);

    @GetMapping(APP_ROOT + "/cart/{idCart}")
    ResponseEntity<CartDto> findById(@PathVariable Long idCart);

    @GetMapping(APP_ROOT + "/cart/filter/{codeCart}")
    ResponseEntity<CartDto> findByCode(@PathVariable("codeCart") String code);

    @GetMapping(APP_ROOT + "/cart/all")
    ResponseEntity<List<CartDto>> findAll();

    @GetMapping(APP_ROOT + "/cart/LinesCart/{idCart}")
    ResponseEntity<List<CartLineDto>> findAllLinesCartByCartId(@PathVariable("idCart") Long idCart);

    @DeleteMapping(APP_ROOT + "/cart/delete/{idCart}")
    ResponseEntity<Void> delete(@PathVariable("idCart") Long id);
}
