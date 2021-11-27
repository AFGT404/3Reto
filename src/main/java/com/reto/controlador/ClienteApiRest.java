package com.reto.controlador;

import com.reto.modelo.Client;
import com.reto.servicios.ClienteServicio;
import com.reto.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin("*")
public class ClienteApiRest extends ControladorGenericoAbstracto<Client, Long> {

    @Autowired
    private ClienteServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Client, Long> getService() {
        return servicio;
    }
}
