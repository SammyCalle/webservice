package com.proyecto.webservice.service;

import com.proyecto.webservice.interfaces.NivelesInterface;
import com.proyecto.webservice.modeloDAO.NivelesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NivelesService implements NivelesInterface {

    @Autowired
    NivelesDAO dao;

    @Override
    public List<Map<String, Object>> statusNivel(int idPersona) {
        return dao.statusNivel(idPersona);
    }

    @Override
    public List<Map<String, Object>> niveles(int idUnidad) {
        return dao.niveles(idUnidad);
    }

    @Override
    public void editarStatusNivel(int idPersona, int idNivel) {
        dao.editarStatusNivel(idPersona,idNivel);
    }
}
