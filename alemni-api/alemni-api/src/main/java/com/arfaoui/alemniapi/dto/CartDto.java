package com.arfaoui.alemniapi.dto;

import com.arfaoui.alemniapi.model.Cart;
import com.arfaoui.alemniapi.model.CartLine;
import com.arfaoui.alemniapi.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class CartDto {

    private Long id;
    private User user ;
    @JsonIgnore
    private List<CartLineDto> cartLines;
    private BigDecimal quantity;
    private BigDecimal totalPrice;

    public static CartDto fromEntity(Cart cart) {

        if (cart == null) {
            return null;
        }
        return CartDto.builder()
                .id(cart.getId())
                .user(cart.getUser())
                .quantity(cart.getQuantity())
                .totalPrice(cart.getTotalPrice())
                .cartLines(cart.getCartLines()
                        .stream()
                        .map(CartLineDto::fromEntity)
                        .collect(Collectors.toList())
                ).build() ;
    }

    public static Cart toEntity(CartDto cartDto) {

        if (cartDto == null) {
            return null;
        }
        Cart cart = new Cart() ;
        cart.setUser(cartDto.user);
        return cart ;
    }
}
