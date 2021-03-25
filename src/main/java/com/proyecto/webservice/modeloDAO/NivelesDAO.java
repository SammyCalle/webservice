package com.proyecto.webservice.modeloDAO;

import com.proyecto.webservice.interfaces.NivelesInterface;
import com.proyecto.webservice.model.Nivel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class NivelesDAO implements NivelesInterface {

    @Autowired
    JdbcTemplate template;


    @Override
    public List<Map<String, Object>> statusNivel(int idPersona) {
        List<Map<String, Object>> statusNiveles = template.queryForList("SELECT * FROM ALUMNOXNIVEL WHERE idPersona = ? ",idPersona);
        return  statusNiveles;
    }

    @Override
    public List<Map<String, Object>> niveles(int idUnidad) {
        List<Map<String, Object>> niveles = template.queryForList("SELECT * FROM NIVEL WHERE idUnidad = ? ",idUnidad);
        return  niveles;
    }

    @Override
    public void editarStatusNivel(int idPersona, int idNivel) {
        template.update("UPDATE ALUMNOXNIVEL SET statusNivel = TRUE WHERE idPersona = ? AND idNivel = ?",idPersona,idNivel);
    }

    private class NivelMapper implements RowMapper<Nivel> {

        @Override
        public Nivel mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Nivel(
                    resultSet.getInt("idPersona"),
                    resultSet.getInt("idNivel"),
                    resultSet.getBoolean("statusUnidad"));
        }
    }
}
