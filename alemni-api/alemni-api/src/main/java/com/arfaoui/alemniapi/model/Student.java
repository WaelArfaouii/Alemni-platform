package com.arfaoui.alemniapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "student")
public class Student extends AbstractEntity {

    @Column(name = "fname")
    private String fName;

    @Column(name = "lname")
    private String lName;

    @Column(name = "address")
    private String address;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mail")
    private String mail;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "idCart")
    private Cart cart;

    @OneToOne
    @JoinColumn(name = "idLearningList")
    private LearningList learningList ;

    @OneToOne
    @JoinColumn(name = "idWishList")
    private WishList wishList ;

}