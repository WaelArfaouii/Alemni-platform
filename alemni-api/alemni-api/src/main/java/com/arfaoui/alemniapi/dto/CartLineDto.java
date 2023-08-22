package com.arfaoui.alemniapi.dto;

import com.arfaoui.alemniapi.controller.CartLine;
import com.arfaoui.alemniapi.model.CartLine;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CartLineDto {
    private Long id;

    private CourseDto courseDto;

    @JsonIgnore
    private CartDto cartDto;

    private BigDecimal quantity;

    private BigDecimal price;

    public static CartLineDto fromEntity(CartLine cartLine) {

        if (cartLine == null) {
            return null;
        }

        return CartLineDto.builder()
                .id(cartLine.getId())
                .courseDto(CourseDto.fromEntity(cartLine.getCourse()))
                .price(cartLine.getPrice())
                .quantity(cartLine.getPrice())
                .cartDto(cartLine.getCart())
                .build() ;
    }
}
