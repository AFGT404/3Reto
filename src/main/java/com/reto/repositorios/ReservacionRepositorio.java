package com.reto.repositorios;

import com.reto.modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.reto.interfaz.ReservacionInterface;

@Repository
public class ReservacionRepositorio extends RepositorioGenericoAbstracto<Reservation,Long>{

    @Autowired
    private ReservacionInterface anInterface;

    @Override
    public CrudRepository<Reservation, Long> getDao() {
        return anInterface;
    }
}
