package com.proyecto.webservice.interfaces;

import com.proyecto.webservice.model.CuentaResponse;

import java.util.List;
import java.util.Map;

public interface CuentaInterface {

    CuentaResponse loggin(String username, String password);

    void editarContrasena(int id,String password);
    List<Map<String,Object>> cuentas();
}
