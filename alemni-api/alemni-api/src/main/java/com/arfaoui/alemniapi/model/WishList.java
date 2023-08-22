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
@Table(name = "wishList")
public class WishList extends AbstractEntity{

    @OneToOne
    @JoinColumn(name = "iduser")
    private User user ;

    @ManyToMany
    private List<Course> courses ;

    @Column(name = "coursesnumber")
    private Long coursesNumber ;

}
