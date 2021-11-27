package com.reto.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "clients")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String password;
    @Column(length = 250)
    private String name;
    private Integer age;

    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"client"})
    private List<Message> messages;

    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"client", "message"})
    private List<Reservation> reservations;

}
