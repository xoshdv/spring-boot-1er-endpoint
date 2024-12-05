package com.spring.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Esta anotación convierte la clase en un controlador REST
public class PrimerControlador {

    // Metodo para manejar solicitudes GET al endpoint '/mensaje'
    @GetMapping("")
    public String Hola() {
        return "Este es mi primer Endpoint"; // Respuesta al cliente
    }
}
