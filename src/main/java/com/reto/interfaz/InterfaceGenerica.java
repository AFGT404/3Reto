package com.reto.interfaz;

import java.io.Serializable;
import java.util.*;

public interface InterfaceGenerica<T, ID extends Serializable> {

    List<T> obtenerTodos();

    Optional<T> obtenerXId(ID id);

    T guardar(T objeto);

    void eliminar(ID id);

}
