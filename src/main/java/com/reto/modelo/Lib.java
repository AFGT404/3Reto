package com.reto.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Data
@Entity
@Table(name = "libs")
public class Lib implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 45)
    private String name;
    private String target;
    private Integer capacity;
    @Column(length = 250)
    private String description;
    

    //Relacion de tabla category - muchos a uno
    @ManyToOne
    @JoinColumn(name = "id_category")
    @JsonIgnoreProperties({"libs"})
    private Category category;

    // Relacion de tabla message - uno a muchos
    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"lib", "category","client"})
    List<Message> messages;

    // Relacion de tabla reservation - uno a muchos
    @OneToMany(mappedBy = "lib", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"lib"})
    List<Reservation> reservations;

}
