package com.arfaoui.alemniapi.controller;

import com.arfaoui.alemniapi.controller.api.CourseApi;
import com.arfaoui.alemniapi.dto.CourseDto;
import com.arfaoui.alemniapi.dto.CourseItemDto;

import java.util.List;

public class CourseController implements CourseApi {
    @Override
    public CourseDto save(CourseDto dto) {
        return null;
    }

    @Override
    public CourseDto findById(Integer id) {
        return null;
    }

    @Override
    public List<CourseDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public CourseItemDto saveItem(Integer idCourse, CourseItemDto dto) {
        return null;
    }

    @Override
    public CourseItemDto findItemById(Integer idCourse, Integer idItem) {
        return null;
    }

    @Override
    public List<CourseItemDto> findAllItems(Integer idCourse) {
        return null;
    }

    @Override
    public void deleteItemById(Integer idCourse, Integer idItem) {

    }
}
