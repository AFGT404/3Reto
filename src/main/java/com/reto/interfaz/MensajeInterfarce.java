package com.reto.interfaz;

import com.reto.modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MensajeInterfarce extends CrudRepository<Message, Long> {
}
