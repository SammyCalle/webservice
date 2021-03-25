package com.proyecto.webservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuenta {

    @Id
    private int idPersona;
    private String userName;
    private String password;
    private boolean status;

    public Cuenta() {
    }

    public Cuenta(int idPersona, String userName, String password, boolean status) {
        this.idPersona = idPersona;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
