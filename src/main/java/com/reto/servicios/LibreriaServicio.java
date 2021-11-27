package com.reto.servicios;

import com.reto.modelo.Lib;
import com.reto.repositorios.LibreriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibreriaServicio extends ServicioGenericoAbstracto<Lib, Long> {

    @Autowired
    private LibreriaRepositorio repositorio;

    @Override
    public LibreriaRepositorio getRepository() {
        return repositorio;
    }

    @Override
    public Lib guardar(Lib objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Lib> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Lib actualizar(Lib objeto) {
        if (objeto.getId() != null) {
            Optional<Lib> c = obtenerXId(objeto.getId());
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
