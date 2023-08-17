package com.arfaoui.alemniapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

public class CartLineDto {
    private Long id;

    private CourseDto courseDto;

    @JsonIgnore
    private CartDto cartDto;

    private BigDecimal quantity;

    private BigDecimal price;
}
