package com.reto.servicios;

import com.reto.modelo.Admin;
import com.reto.repositorios.AdminRepositorio;
import com.reto.repositorios.RepositorioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminServicio extends ServicioGenericoAbstracto<Admin, Long> {

    @Autowired
    private AdminRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Admin, Long> getRepository() {
        return repositorio;
    }

    @Override
    public Admin guardar(Admin objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Admin> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Admin actualizar(Admin objeto) {
        if (objeto.getId() != null) {
            Optional<Admin> c = obtenerXId(objeto.getId());
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
