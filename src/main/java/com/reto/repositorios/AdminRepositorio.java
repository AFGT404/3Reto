package com.reto.repositorios;

import com.reto.interfaz.AdminInterface;
import com.reto.modelo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepositorio extends RepositorioGenericoAbstracto<Admin,Long>{

    @Autowired
    private AdminInterface anInterface;

    @Override
    public CrudRepository<Admin, Long> getDao() {
        return anInterface;
    }
}
