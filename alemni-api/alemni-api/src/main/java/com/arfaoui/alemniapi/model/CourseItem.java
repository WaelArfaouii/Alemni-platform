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
@Table(name = "courseItem")
public class CourseItem extends AbstractEntity {

    @Column(name = "title")
    private String title ;

    @Column(name = "description")
    private String description ;

    @ManyToOne
    @JoinColumn(name = "idCourse")
    private Course course ;








}