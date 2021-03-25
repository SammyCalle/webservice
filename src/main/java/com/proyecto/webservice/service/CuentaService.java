package com.proyecto.webservice.service;


import com.proyecto.webservice.interfaces.CuentaInterface;
import com.proyecto.webservice.model.CuentaResponse;
import com.proyecto.webservice.modeloDAO.CuentaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CuentaService implements CuentaInterface {
    @Autowired
    CuentaDAO dao;
    @Override
    public CuentaResponse loggin(String username, String password) {
        return dao.loggin(username,password);
    }

    @Override
    public void editarContrasena(int id, String password) {
        dao.editarContrasena(id,password);
    }

    @Override
    public List<Map<String, Object>> cuentas() {
        return dao.cuentas();
    }
}
