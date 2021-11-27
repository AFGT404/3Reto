package com.reto.repositorios;

import com.reto.modelo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.reto.interfaz.CategoriaInterface;

@Repository
public class CategoriaRepositorio extends RepositorioGenericoAbstracto<Category,Long>{

    @Autowired
    private CategoriaInterface anInterface;

    @Override
    public CrudRepository<Category, Long> getDao() {
        return anInterface;
    }
}
