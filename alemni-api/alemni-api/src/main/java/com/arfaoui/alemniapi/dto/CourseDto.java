package com.arfaoui.alemniapi.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CourseDto {
    private Long id;

    private BigDecimal price;

    private String photo;
    private String title ;
    private String description ;

    private CategoryDto category;
}
