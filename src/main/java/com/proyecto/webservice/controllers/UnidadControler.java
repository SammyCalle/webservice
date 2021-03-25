package com.proyecto.webservice.controllers;

import com.proyecto.webservice.request.UpdateUnidadRequest;
import com.proyecto.webservice.service.UnidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/unidad")
public class UnidadControler {

    @Autowired
    UnidadService service;

    @GetMapping("/status")
    public List<Map<String,Object>> statusUnidad(@RequestParam(name = "id") int id){
        return service.statusUnidad(id);
    }

    @PostMapping("/actualizar")
    public void editarStatusUnidad(@RequestBody UpdateUnidadRequest updateUnidadRequest){
        service.editarStatusUnidad(updateUnidadRequest.getIdPersona(), updateUnidadRequest.getIdUnidad());
    }


}
