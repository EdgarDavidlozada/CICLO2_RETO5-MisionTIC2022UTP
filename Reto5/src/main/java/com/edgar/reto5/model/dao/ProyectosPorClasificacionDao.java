package com.edgar.reto5.model.dao;

import com.edgar.reto5.model.vo.ProyectosPorClasificacionVo;
import com.edgar.reto5.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author beelz
 */
public class ProyectosPorClasificacionDao {

    public ProyectosPorClasificacionDao() {
    }

    public List<ProyectosPorClasificacionVo> find() throws SQLException {

        var response = new ArrayList<ProyectosPorClasificacionVo>();
        Connection connection = null;
        try {
            connection = JDBCUtilities.getConnection();
            String consulta = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto\n"
                    + "WHERE Clasificacion LIKE 'Casa Campestre' AND Ciudad LIKE 'Santa Marta' OR Ciudad LIKE 'Cartagena' OR Ciudad LIKE 'Barranquilla';";
            var statement = connection.prepareStatement(consulta);
            var rset = statement.executeQuery();
            while (rset.next()) {
                var ProyectosPorClasificacionVo = new ProyectosPorClasificacionVo();
                ProyectosPorClasificacionVo.setID_Proyecto(rset.getInt(1));
                ProyectosPorClasificacionVo.setConstructora(rset.getString(2));
                ProyectosPorClasificacionVo.setNumero_Habitaciones(rset.getDouble(3));
                ProyectosPorClasificacionVo.setCiudad(rset.getString(4));
                response.add(ProyectosPorClasificacionVo);
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
