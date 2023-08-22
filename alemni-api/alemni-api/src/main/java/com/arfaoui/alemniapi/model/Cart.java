package com.arfaoui.alemniapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cart")
public class Cart extends AbstractEntity {

    @OneToOne
    @JoinColumn(name = "userid")
    private User user ;

    @OneToMany(mappedBy = "cart")
    private List<CartLine> cartLines;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "totalPrice")
    private BigDecimal totalPrice;

}
