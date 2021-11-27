package com.reto.servicios;

import com.reto.modelo.Category;
import com.reto.repositorios.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaServicio extends ServicioGenericoAbstracto<Category, Long> {

    @Autowired
    private CategoriaRepositorio repositorio;

    @Override
    public CategoriaRepositorio getRepository() {
        return repositorio;
    }

    @Override
    public Category guardar(Category objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Category> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Category actualizar(Category objeto) {
        if (objeto.getId() != null) { //Verificar que sea diferente de null
            Optional<Category> c = obtenerXId(objeto.getId());
            if (!c.isEmpty()) { // Si existe en la base de datos
                return repositorio.guardar(objeto); // Lo guarda
            } else {
                return objeto; //de lo contrario retorne el objeto
            }
        } else {
            return objeto;
        }
    }
}
