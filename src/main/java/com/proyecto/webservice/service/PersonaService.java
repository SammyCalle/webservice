package com.proyecto.webservice.service;


import com.proyecto.webservice.interfaces.PersonaInterface;
import com.proyecto.webservice.model.Persona;
import com.proyecto.webservice.modeloDAO.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements PersonaInterface {

    @Autowired
    PersonaDAO dao;

    @Override
    public Persona obtenerPersona(int id) {
        return dao.obtenerPersona(id);
    }
}
