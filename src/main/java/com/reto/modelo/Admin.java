package com.reto.modelo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "admins")
public class Admin implements Serializable {

    @Id
    private Long id;
    @Column(length = 250)
    private String name;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String password;
    
}
