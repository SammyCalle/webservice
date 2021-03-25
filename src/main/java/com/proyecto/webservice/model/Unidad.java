package com.proyecto.webservice.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Unidad {

    @Id
    private int idPersona;
    private int idUnidad;
    private boolean statusUnidad;

    public Unidad() {
    }

    public Unidad(int idPersona, int idUnidad, boolean statusUnidad) {
        this.idPersona = idPersona;
        this.idUnidad = idUnidad;
        this.statusUnidad = statusUnidad;
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

    public boolean isStatusUnidad() {
        return statusUnidad;
    }

    public void setStatusUnidad(boolean statusUnidad) {
        this.statusUnidad = statusUnidad;
    }
}
