package com.reto.servicios;

import com.reto.modelo.Score;
import com.reto.repositorios.ScoreRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScoreServicio extends ServicioGenericoAbstracto<Score, Long> {

    @Autowired
    private ScoreRepositorio repositorio;

    @Override
    public ScoreRepositorio getRepository() {
        return repositorio;
    }

    @Override
    public Score guardar(Score objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Score> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Score actualizar(Score objeto) {
        if (objeto.getId() != null) {
            Optional<Score> c = obtenerXId(objeto.getId());
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
