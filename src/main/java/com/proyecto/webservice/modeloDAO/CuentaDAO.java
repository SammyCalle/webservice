package com.proyecto.webservice.modeloDAO;


import com.proyecto.webservice.interfaces.CuentaInterface;
import com.proyecto.webservice.model.Cuenta;
import com.proyecto.webservice.model.CuentaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class CuentaDAO implements CuentaInterface {

    @Autowired
    JdbcTemplate template;
    Cuenta cuenta;
    Cuenta errorUsername;
    //Cuenta errorPassword;
    List<Cuenta> errorPassword;
    CuentaResponse cuentaResponse;
    @Override
    public CuentaResponse loggin(String username, String password) {
        try {
            cuenta = template.queryForObject("SELECT * FROM CUENTA where nombre_usuario = ? and password = ?", new cuentaMapper(), username, password);
            cuentaResponse = new CuentaResponse(0,cuenta.getIdPersona(),"Loggin realizado correctamente",cuenta.isStatus());
            return cuentaResponse;
        }catch (EmptyResultDataAccessException e) {
            try {
                errorUsername = template.queryForObject("SELECT * FROM CUENTA WHERE nombre_usuario = ?",new cuentaMapper(),username);
                cuentaResponse = new CuentaResponse(2,0,"La contraseña ingresada es incorrecta",true);
                return cuentaResponse;
            }catch (EmptyResultDataAccessException e2){
                try{
                    errorPassword = template.query("SELECT * FROM CUENTA WHERE password = ?",new cuentaMapper(),password);
                    //errorPassword = template.queryForObject("SELECT * FROM CUENTA WHERE password = ?",new cuentaMapper(),password);
                    cuentaResponse = new CuentaResponse(1,0,"El usuario ingresado es incorrecto",true);
                    return cuentaResponse;
                }catch (EmptyResultDataAccessException e3){
                    cuentaResponse = new CuentaResponse(3,0,"Ambos Campos ingresados son Incorrectos",true);
                    return cuentaResponse;
                }
            }
        }
    }


    @Override
    public void editarContrasena(int id, String password) {
        template.update("UPDATE CUENTA SET password = ? , status = TRUE where idPersona = ?",password,id);
    }

    @Override
    public List<Map<String, Object>> cuentas() {
        List<Map<String, Object>> cuentas = template.queryForList("SELECT * FROM CUENTA");
        return cuentas;
    }

    private class listaCuentaMapper implements RowMapper<List<Cuenta>> {

        @Override
        public List<Cuenta> mapRow(ResultSet resultSet, int i) throws SQLException {
            return null;
        }
    }

    private class cuentaMapper implements RowMapper<Cuenta> {

        @Override
        public Cuenta mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Cuenta(
                    resultSet.getInt("idPersona"),
                    resultSet.getString("nombre_usuario"),
                    resultSet.getString("password"),
                    resultSet.getBoolean("status"));
        }
    }
}
