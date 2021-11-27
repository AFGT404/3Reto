package com.reto.servicios;

import com.reto.modelo.Reservation;
import com.reto.repositorios.ReservacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservacionServicio extends ServicioGenericoAbstracto<Reservation, Long> {

    @Autowired
    private ReservacionRepositorio repositorio;

    @Override
    public ReservacionRepositorio getRepository() {
        return repositorio;
    }

    @Override
    public Reservation guardar(Reservation objeto) {
        if (objeto.getIdReservation() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Reservation> c = obtenerXId(objeto.getIdReservation());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Reservation actualizar(Reservation objeto) {
        if (objeto.getIdReservation() != null) {
            Optional<Reservation> c = obtenerXId(objeto.getIdReservation());
            if (!c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        } else {
            return objeto;
        }
    }
}
