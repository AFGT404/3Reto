package com.reto.controlador;

import com.reto.modelo.Category;
import com.reto.servicios.CategoriaServicio;
import com.reto.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin("*")
public class CategoriaApiRest extends ControladorGenericoAbstracto<Category, Long> {
    @Autowired
    private CategoriaServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Category, Long> getService() {
        return servicio;
    }
}
