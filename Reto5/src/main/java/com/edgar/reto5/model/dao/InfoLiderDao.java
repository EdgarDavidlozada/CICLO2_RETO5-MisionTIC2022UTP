package com.edgar.reto5.model.dao;

import com.edgar.reto5.model.vo.InfoLiderVo;
import com.edgar.reto5.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author beelz
 */
public class InfoLiderDao {

    public InfoLiderDao() {
    }

    public List<InfoLiderVo> find() throws SQLException {

        var response = new ArrayList<InfoLiderVo>();
        Connection connection = null;
        try {
            connection = JDBCUtilities.getConnection();
            String consulta = "SELECT ID_Lider,Nombre,Primer_Apellido,Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
            var statement = connection.prepareStatement(consulta);
            var rset = statement.executeQuery();
            while (rset.next()) {
                var InfoLiderVo = new InfoLiderVo();
                InfoLiderVo.setID_Lider(rset.getInt(1));
                InfoLiderVo.setNombre(rset.getString(2));
                InfoLiderVo.setPrimer_Apellido(rset.getString(3));
                InfoLiderVo.setCiudad_Residencia(rset.getString(4));
                response.add(InfoLiderVo);
            }
            rset.close();
            statement.close();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return response;
    }
}
