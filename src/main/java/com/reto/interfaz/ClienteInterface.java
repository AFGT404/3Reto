package com.reto.interfaz;

import com.reto.modelo.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClienteInterface extends CrudRepository<Client,Long> {
}
