package com.reto.repositorios;

import com.reto.modelo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.reto.interfaz.MensajeInterfarce;

@Repository
public class MensajeRepositorio extends RepositorioGenericoAbstracto<Message,Long>{

    @Autowired
    private MensajeInterfarce anInterface;

    @Override
    public CrudRepository<Message, Long> getDao() {
        return anInterface;
    }
}
