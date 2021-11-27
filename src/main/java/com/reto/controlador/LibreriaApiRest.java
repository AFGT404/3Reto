package com.reto.controlador;

import com.reto.modelo.Lib;
import com.reto.servicios.LibreriaServicio;
import com.reto.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Lib")
@CrossOrigin("*")
public class LibreriaApiRest extends ControladorGenericoAbstracto<Lib, Long> {
    @Autowired
    private LibreriaServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Lib, Long> getService() {
        return servicio;
    }
}
