package com.reto.repositorios;

import com.reto.modelo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.reto.interfaz.ScoreInterface;

@Repository
public class ScoreRepositorio extends RepositorioGenericoAbstracto<Score,Long>{

    @Autowired
    private ScoreInterface anInterface;

    @Override
    public CrudRepository<Score, Long> getDao() {
        return anInterface;
    }
}
