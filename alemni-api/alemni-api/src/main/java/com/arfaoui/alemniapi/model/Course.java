package com.arfaoui.alemniapi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "course")
public class Course extends AbstractEntity {

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;

    @OneToMany(mappedBy = "course")
    private List<CartLine> cartLines;

    @ManyToMany
    @JoinColumn(name = "idStudent")
    private List<Student> students;

    @ManyToMany
    @JoinColumn(name = "idTeacher")
    private List<Teacher> teachers;

    @ManyToMany
    private List<WishList> wishLists ;

    @ManyToMany
    private List<LearningList> learningLists ;


}
