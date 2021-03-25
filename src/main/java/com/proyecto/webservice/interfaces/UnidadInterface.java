package com.proyecto.webservice.interfaces;

import java.util.List;
import java.util.Map;

public interface UnidadInterface {

    List<Map<String,Object>> statusUnidad(int idPersona);
    void editarStatusUnidad(int idPersona, int idUnidad);
}
