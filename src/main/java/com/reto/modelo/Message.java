package com.reto.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "messages")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;
    private String messageText;
    
    /* private Client client
    *  private Lib lib
    */

    @ManyToOne
    @JoinColumn(name = "id_lib")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Lib lib;

    @ManyToOne
    @JoinColumn(name = "id_Client")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;


}