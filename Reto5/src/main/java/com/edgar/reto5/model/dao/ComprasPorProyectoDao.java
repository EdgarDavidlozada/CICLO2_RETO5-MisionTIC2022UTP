package com.edgar.reto5.model.dao;

import com.edgar.reto5.model.vo.ComprasPorProyectoVo;
import com.edgar.reto5.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author beelz
 */
public class ComprasPorProyectoDao {

    public ComprasPorProyectoDao() {
    }

    public List<ComprasPorProyectoVo> find() throws SQLException {

        var response = new ArrayList<ComprasPorProyectoVo>();
        Connection connection = null;
        try {
            connection = JDBCUtilities.getConnection();
            String consulta = "SELECT ID_Compra,Constructora,Banco_Vinculado FROM Compra AS c\n"
                    + "INNER JOIN Proyecto AS p ON c.ID_Proyecto=p.ID_Proyecto\n"
                    + "AND c.Proveedor LIKE 'Homecenter' AND p.Ciudad LIKE 'Salento';";
            var statement = connection.prepareStatement(consulta);
            var rset = statement.executeQuery();
            while (rset.next()) {
                var ComprasPorProyectoVo = new ComprasPorProyectoVo();
                ComprasPorProyectoVo.setID_Compra(rset.getInt(1));
                ComprasPorProyectoVo.setConstructura(rset.getString(2));
                ComprasPorProyectoVo.setBanco_Vinculado(rset.getString(3));

                response.add(ComprasPorProyectoVo);
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
