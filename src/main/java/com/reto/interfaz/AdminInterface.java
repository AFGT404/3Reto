package com.reto.interfaz;

import com.reto.modelo.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminInterface extends CrudRepository<Admin,Long> {
}
