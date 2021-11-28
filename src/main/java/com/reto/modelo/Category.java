package com.reto.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 45)
    private String name;
    @Column(length = 250)
    private String description;

    // Relacion listas lib
    @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
    //@JsonIgnoreProperties({"category", "lib"})
    public List<Lib> libs;

}
