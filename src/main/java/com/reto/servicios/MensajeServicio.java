package com.reto.servicios;

import com.reto.modelo.Message;
import com.reto.repositorios.MensajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MensajeServicio extends ServicioGenericoAbstracto<Message, Long> {

    @Autowired
    private MensajeRepositorio repositorio;

    @Override
    public MensajeRepositorio getRepository() {
        return repositorio;
    }

    @Override
    public Message guardar(Message objeto) {
        if (objeto.getIdMessage() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Message> c = obtenerXId(objeto.getIdMessage());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Message actualizar(Message objeto) {
        if (objeto.getIdMessage() != null) {
            Optional<Message> c = obtenerXId(objeto.getIdMessage());
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
