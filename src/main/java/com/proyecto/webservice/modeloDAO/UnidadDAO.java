package com.proyecto.webservice.modeloDAO;

import com.proyecto.webservice.interfaces.UnidadInterface;
import com.proyecto.webservice.model.Unidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class UnidadDAO implements UnidadInterface {

    @Autowired
    JdbcTemplate template;


    @Override
    public List<Map<String, Object>> statusUnidad(int idPersona) {
        List<Map<String,Object>> statusUnidad = template.queryForList("SELECT * FROM ALUMNOXUNIDAD WHERE idPersona = ?",
                idPersona);

        return  statusUnidad;
    }

    @Override
    public void editarStatusUnidad(int idPersona, int idUnidad) {
        template.update("UPDATE ALUMNOXUNIDAD SET statusUnidad = TRUE WHERE idPersona = ? AND idUnidad = ?",idPersona,idUnidad);
    }

    private class UnidadMapper implements RowMapper<Unidad> {

        @Override
        public Unidad mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Unidad(
                    resultSet.getInt("idPersona"),
                    resultSet.getInt("idUnidad"),
                    resultSet.getBoolean("statusUnidad"));
        }
    }
}
