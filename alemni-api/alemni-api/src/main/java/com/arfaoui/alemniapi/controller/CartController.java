package com.arfaoui.alemniapi.controller;

import com.arfaoui.alemniapi.controller.api.CartApi;
import com.arfaoui.alemniapi.dto.CartDto;
import com.arfaoui.alemniapi.dto.CartLineDto;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.util.List;

public class CartController implements CartApi {
    @Override
    public ResponseEntity<CartDto> save(CartDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<CartDto> updateQuantityCart(Long idCart, Long idLineCart, BigDecimal quantity) {
        return null;
    }

    @Override
    public ResponseEntity<CartDto> update(Long idCart, Long id) {
        return null;
    }

    @Override
    public ResponseEntity<CartDto> updateCourse(Long idCart, Long idLineCart, Long idCourse) {
        return null;
    }

    @Override
    public ResponseEntity<CartDto> deleteCourse(Long idCart, Long idLineCart) {
        return null;
    }

    @Override
    public ResponseEntity<CartDto> findById(Long idCart) {
        return null;
    }

    @Override
    public ResponseEntity<CartDto> findByCode(String code) {
        return null;
    }

    @Override
    public ResponseEntity<List<CartDto>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<List<CartLineDto>> findAllLinesCartByCartId(Long idCart) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        return null;
    }
}
