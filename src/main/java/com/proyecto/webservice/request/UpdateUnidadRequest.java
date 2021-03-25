package com.proyecto.webservice.request;

public class
UpdateUnidadRequest {
    private int idPersona;
    private int idUnidad;

    public UpdateUnidadRequest(int idPersona, int idUnidad) {
        this.idPersona = idPersona;
        this.idUnidad = idUnidad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }
}
