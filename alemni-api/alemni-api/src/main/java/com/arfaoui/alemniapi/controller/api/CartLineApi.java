package com.arfaoui.alemniapi.controller.api;
import com.arfaoui.alemniapi.dto.CartLineDto;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.arfaoui.alemniapi.utils.Constants.APP_ROOT;

@Api("cartLines")
public interface CartLineApi {
    @PostMapping(value = APP_ROOT + "/cartLines/create")
    CartLineDto save(@RequestBody CartLineDto dto);

    @GetMapping(value = APP_ROOT + "/cartLines/{idCartLine}")
    CartLineDto findById(@PathVariable("idCartLine") Integer id);

    @GetMapping(value = APP_ROOT + "/cartLines/all")
    List<CartLineDto> findAll();

    @DeleteMapping(value = APP_ROOT + "/cartLines/delete/{idCartLine}")
    void delete(@PathVariable("idCartLine") Integer id);
}
