package com.reto.repositorios;

import com.reto.interfaz.LibreriaInterface;
import com.reto.modelo.Lib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LibreriaRepositorio extends RepositorioGenericoAbstracto<Lib,Long>{

    @Autowired
    private LibreriaInterface anInterface;

    @Override
    public CrudRepository<Lib, Long> getDao() {
        return anInterface;
    }
}
