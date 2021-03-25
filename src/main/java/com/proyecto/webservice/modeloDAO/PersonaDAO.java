package com.proyecto.webservice.modeloDAO;


import com.proyecto.webservice.interfaces.PersonaInterface;
import com.proyecto.webservice.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class PersonaDAO implements PersonaInterface {

    @Autowired
    JdbcTemplate template;


    @Override
    public Persona obtenerPersona(int id) {
        Persona persona = template.queryForObject("SELECT * FROM PERSONA WHERE idPersona = ?",new PersonaMapper(),
                id);
        return persona;
    }


    private class PersonaMapper implements RowMapper<Persona> {

        @Override
        public Persona mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Persona(

                    resultSet.getInt("idPersona"),
                    resultSet.getString("primer_nombre"),
                    resultSet.getString("segundo_nombre"),
                    resultSet.getString("primer_apellido"),
                    resultSet.getString("segundo_apellido"),
                    resultSet.getInt("dni"));
        }
    }
}
