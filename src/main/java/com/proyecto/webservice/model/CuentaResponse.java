package com.proyecto.webservice.model;

import javax.persistence.Id;

public class CuentaResponse {

    @Id
    private int idResponse;
    private int idPersona;
    private String description;
    private boolean status;

    public CuentaResponse() {
    }

    public CuentaResponse(int idResponse, int idPersona, String description, boolean status) {
        this.idResponse = idResponse;
        this.idPersona = idPersona;
        this.description = description;
        this.status = status;
    }

    public int getIdResponse() {
        return idResponse;
    }

    public void setIdResponse(int idResponse) {
        this.idResponse = idResponse;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
