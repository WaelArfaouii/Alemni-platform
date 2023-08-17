package com.arfaoui.alemniapi.controller.api;

import com.arfaoui.alemniapi.dto.CategoryDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.arfaoui.alemniapi.utils.Constants.APP_ROOT;

@Api("categories")
public interface CategoryApi {
    @PostMapping(value = APP_ROOT + "/categories/create")
    CategoryDto save(@RequestBody CategoryDto dto);

    @GetMapping(value = APP_ROOT + "/categories/{idCategory}")
    CategoryDto findById(@PathVariable("idCategory") Integer id);

    @GetMapping(value = APP_ROOT + "/categories/all")
    List<CategoryDto> findAll();

    @DeleteMapping(value = APP_ROOT + "/categories/delete/{idCategory}")
    void delete(@PathVariable("idCategory") Integer id);

}
