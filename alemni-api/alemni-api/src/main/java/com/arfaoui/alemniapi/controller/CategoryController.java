package com.arfaoui.alemniapi.controller;

import com.arfaoui.alemniapi.controller.api.CategoryApi;
import com.arfaoui.alemniapi.dto.CategoryDto;

import java.util.List;

public class CategoryController implements CategoryApi {
    @Override
    public CategoryDto save(CategoryDto dto) {
        return null;
    }

    @Override
    public CategoryDto findById(Integer id) {
        return null;
    }

    @Override
    public List<CategoryDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
