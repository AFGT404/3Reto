package com.reto.interfaz;

import com.reto.modelo.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreInterface extends CrudRepository<Score, Long> {
}
