package com.reto.servicios;

import com.reto.repositorios.RepositorioGenericoAbstracto;

import java.io.Serializable;
import java.util.*;

public abstract class ServicioGenericoAbstracto<T, ID extends Serializable> {

    public abstract RepositorioGenericoAbstracto<T, ID> getRepository();

    public abstract T guardar(T objeto);

    public abstract T actualizar(T objeto);

    public List<T> obtenerTodos() {
        return getRepository().obtenerTodos();
    }

    public Optional<T> obtenerXId(ID id) {
        return getRepository().obtenerXId(id);
    }

    public boolean eliminar(ID id) {
        return obtenerXId(id).map(t -> {
            getRepository().eliminar(id);
            return true;
        }).orElse(false);
    }
}
