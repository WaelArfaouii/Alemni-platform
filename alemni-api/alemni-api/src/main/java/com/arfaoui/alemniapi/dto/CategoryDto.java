package com.arfaoui.alemniapi.dto;

import com.arfaoui.alemniapi.model.Course;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDto {
    private Long id ;

    private List<CourseDto> courses ;
}
