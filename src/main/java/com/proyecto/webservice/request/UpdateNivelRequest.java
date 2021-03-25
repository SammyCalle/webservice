package com.proyecto.webservice.request;

public class
UpdateNivelRequest {
    private int idPersona;
    private int idNivel;

    public UpdateNivelRequest(int idPersona, int idNivel) {
        this.idPersona = idPersona;
        this.idNivel = idNivel;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }
}
