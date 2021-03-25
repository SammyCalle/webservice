package com.proyecto.webservice.controllers;


import com.proyecto.webservice.model.CuentaResponse;
import com.proyecto.webservice.request.LoginRequest;
import com.proyecto.webservice.request.UpdateRequest;
import com.proyecto.webservice.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/cuenta")
public class CuentaControler {

    @Autowired
    CuentaService service;

    @PostMapping("/loggin")
    public CuentaResponse loggin(@RequestBody LoginRequest loginRequest){
        return service.loggin(loginRequest.getUserName(),loginRequest.getPassword());
    }

    @PostMapping("/passwordUpdate")
    public void actualizarContrasena(@RequestBody UpdateRequest updateRequest){
        service.editarContrasena(updateRequest.getId(),updateRequest.getPassword());
    }

    @GetMapping("/listar")
    public List<Map<String, Object>> obtenerCuentas(){
        return service.cuentas();
    }
}
