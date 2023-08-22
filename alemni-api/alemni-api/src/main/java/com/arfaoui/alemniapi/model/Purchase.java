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
@Table(name = "purchase")
public class Purchase extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user ;

    @OneToOne
    @JoinColumn(name = "cartid")
    private Cart cart ;

    @Column(name = "price")
    private BigDecimal price ;


}
