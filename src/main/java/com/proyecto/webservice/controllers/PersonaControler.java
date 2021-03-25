package com.proyecto.webservice.controllers;

import com.proyecto.webservice.model.Persona;
import com.proyecto.webservice.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/Persona")
public class PersonaControler {

    @Autowired
    PersonaService service;

    @GetMapping("/obtener")
    public Persona obtenerPersona(@RequestParam(name = "id") int id){
       return service.obtenerPersona(id);
    }

}
