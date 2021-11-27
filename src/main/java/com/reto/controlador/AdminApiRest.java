package com.reto.controlador;

import com.reto.modelo.Admin;
import com.reto.servicios.AdminServicio;
import com.reto.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin("*")
public class AdminApiRest extends ControladorGenericoAbstracto<Admin, Long> {

    @Autowired
    private AdminServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Admin, Long> getService() {
        return servicio;
    }
}
