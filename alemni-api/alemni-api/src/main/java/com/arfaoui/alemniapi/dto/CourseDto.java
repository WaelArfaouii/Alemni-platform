package com.arfaoui.alemniapi.dto;

import java.math.BigDecimal;

public class CourseDto {
    private Long id;

    private BigDecimal price;

    private String photo;
    private String title ;
    private String description ;

    private CategoryDto category;
}
