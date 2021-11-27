package com.reto.controlador;

import com.reto.modelo.Reservation;
import com.reto.servicios.ReservacionServicio;
import com.reto.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin("*")
public class ReservacionApiRest extends ControladorGenericoAbstracto<Reservation, Long> {
    @Autowired
    private ReservacionServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Reservation, Long> getService() {
        return servicio;
    }
}
