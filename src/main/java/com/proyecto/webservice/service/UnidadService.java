package com.proyecto.webservice.service;


import com.proyecto.webservice.interfaces.UnidadInterface;
import com.proyecto.webservice.modeloDAO.UnidadDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UnidadService implements UnidadInterface {
    @Autowired
    UnidadDAO dao;

    @Override
    public List<Map<String, Object>> statusUnidad(int idPersona) {
        return dao.statusUnidad(idPersona);
    }

    @Override
    public void editarStatusUnidad(int idPersona, int idUnidad) {
        dao.editarStatusUnidad(idPersona,idUnidad);
    }
}
