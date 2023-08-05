package com.arfaoui.alemniapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cartLine")
public class CartLine extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "idCourse")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "idCart")
    private Cart cart;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "price")
    private BigDecimal price;

}

