package com.arfaoui.alemniapi.controller.api;

import com.arfaoui.alemniapi.dto.CourseDto;
import com.arfaoui.alemniapi.dto.CourseItemDto;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.arfaoui.alemniapi.utils.Constants.APP_ROOT;

@Api("courses")
public interface CourseApi {
    @PostMapping(value = APP_ROOT + "/courses/create")
    CourseDto save(@RequestBody CourseDto dto);

    @GetMapping(value = APP_ROOT + "/courses/{idCourse}" )
    CourseDto findById(@PathVariable("idCourse") Integer id);

    @GetMapping(value = APP_ROOT + "/courses/all")
    List<CourseDto> findAll();

    @DeleteMapping(value = APP_ROOT + "/courses/delete/{idCourse}")
    void delete(@PathVariable("idCourse") Integer id);

    //manipulate course items
    //add course item
    @PostMapping(value = APP_ROOT + "/courses/{idCourse}/items/add")
    CourseItemDto saveItem( @PathVariable("idCourse") Integer idCourse , @RequestBody CourseItemDto dto  );

    //find item by id
    @GetMapping(value = APP_ROOT + "/courses/{idCourse}/items/{idItem}")
    CourseItemDto findItemById(@PathVariable("idCourse") Integer idCourse , @PathVariable("idItem") Integer idItem );

    //find all items

    @GetMapping(value = APP_ROOT + "/courses/{idCourse}/items/all")
    List<CourseItemDto> findAllItems(@PathVariable("idCourse") Integer idCourse);

    //delete item from course *

    @DeleteMapping(value = APP_ROOT + "/courses/{idCourse}/items/{idItem}/delete")
    void deleteItemById(@PathVariable("idCourse") Integer idCourse , @PathVariable("idItem") Integer idItem );


}
