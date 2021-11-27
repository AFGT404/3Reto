package com.reto.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Data
@Entity
@Table(name = "reservations")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    //@Temporal(TemporalType.DATE)
    private Date startDate;
    //@Temporal(TemporalType.DATE)
    private Date devolutionDate;
    private String status="created";

    /* 
    * Relación con la otras tablas
    */

    @ManyToOne
    @JoinColumn(name = "id_lib")
    @JsonIgnoreProperties({/*"messages", */"reservations"})
    private Lib lib;

    @ManyToOne
    @JoinColumn(name = "id_client")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_score")
    private Score score;

}
