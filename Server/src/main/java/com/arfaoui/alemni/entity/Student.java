package com.arfaoui.alemni.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Student {
    @Id
    private Long id ;

    private String name ;
    @ManyToMany
    private List<Instructor> instructor ;
    private String description ;
    private String duration ;
    private Long price ;
    @ManyToMany
    private List<Student> enrolled_students ;
    private String image_url ;
}
