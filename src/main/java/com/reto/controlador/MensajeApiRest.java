package com.reto.controlador;

import com.reto.modelo.Message;
import com.reto.servicios.MensajeServicio;
import com.reto.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin("*")
public class MensajeApiRest extends ControladorGenericoAbstracto<Message, Long> {
    @Autowired
    private MensajeServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Message, Long> getService() {
        return servicio;
    }
}
