package com.reto.repositorios;

import com.reto.modelo.Client;
import com.reto.interfaz.ClienteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositorio extends RepositorioGenericoAbstracto<Client,Long>{

    @Autowired
    private ClienteInterface anInterface;

    @Override
    public CrudRepository<Client, Long> getDao() {
        return anInterface;
    }
}
