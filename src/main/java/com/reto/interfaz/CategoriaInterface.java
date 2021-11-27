package com.reto.interfaz;

import com.reto.modelo.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaInterface extends CrudRepository<Category, Long> {
}
