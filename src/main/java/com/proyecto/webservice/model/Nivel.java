package com.proyecto.webservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nivel {

    @Id
    private int idPersona;
    private int idNivel;
    private boolean statusNivel;

    public Nivel() {
    }

    public Nivel(int idPersona, int idNivel, boolean statusNivel) {
        this.idPersona = idPersona;
        this.idNivel = idNivel;
        this.statusNivel = statusNivel;
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

    public boolean isStatusNivel() {
        return statusNivel;
    }

    public void setStatusNivel(boolean statusNivel) {
        this.statusNivel = statusNivel;
    }
}
