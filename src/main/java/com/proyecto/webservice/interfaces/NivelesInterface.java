package com.proyecto.webservice.interfaces;

import java.util.List;
import java.util.Map;

public interface NivelesInterface {

    List<Map<String,Object>> statusNivel(int idPersona);
    List<Map<String,Object>> niveles(int idUnidad);
    void editarStatusNivel(int idPersona, int idNivel);
}
