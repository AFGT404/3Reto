package com.reto.interfaz;

import com.reto.modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservacionInterface extends CrudRepository<Reservation, Long> {
}
