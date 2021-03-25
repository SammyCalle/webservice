package com.proyecto.webservice.controllers;


import com.proyecto.webservice.request.UpdateNivelRequest;
import com.proyecto.webservice.service.NivelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/nivel")
public class NivelControler {

    @Autowired
    NivelesService service;

    @GetMapping("/status")
    public List<Map<String,Object>> statusNivel(@RequestParam(name = "id") int id){
       return service.statusNivel(id);
    }

    @PostMapping("/actualizar")
    public void editarStatusNivel(@RequestBody UpdateNivelRequest updateNivelRequest){
        service.editarStatusNivel(updateNivelRequest.getIdPersona(), updateNivelRequest.getIdNivel());
    }

    @GetMapping("/listar")
    public List<Map<String,Object>> listarNiveles(@RequestParam(name = "id") int id){
        return service.niveles(id);
    }
}
