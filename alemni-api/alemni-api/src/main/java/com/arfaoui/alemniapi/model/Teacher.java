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
@Table(name = "teacher")
public class Teacher extends AbstractEntity {
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

    @ManyToMany
    @JoinColumn(name = "idCourse")
    private List<Course> courses;
}
