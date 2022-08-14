package com.edgar.reto5.controller;

import com.edgar.reto5.model.dao.ComprasPorProyectoDao;
import com.edgar.reto5.model.dao.InfoLiderDao;
import com.edgar.reto5.model.dao.ProyectosPorClasificacionDao;

import com.edgar.reto5.model.vo.ComprasPorProyectoVo;
import com.edgar.reto5.model.vo.InfoLiderVo;
import com.edgar.reto5.model.vo.ProyectosPorClasificacionVo;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author beelz
 */
public class ReportesController {

    private final InfoLiderDao infoLiderDao;
    private final ProyectosPorClasificacionDao proyectosPorClasificacionDao;
    private final ComprasPorProyectoDao comprasPorProyectoDao;

    public ReportesController() {
        this.infoLiderDao = new InfoLiderDao();
        this.proyectosPorClasificacionDao = new ProyectosPorClasificacionDao();
        this.comprasPorProyectoDao = new ComprasPorProyectoDao();
    }

    public List<InfoLiderVo> findInfoLider() throws SQLException {
        return infoLiderDao.find();
    }

    public List<ProyectosPorClasificacionVo> findProyectosPorClasificacionVo() throws SQLException {
        return proyectosPorClasificacionDao.find();
    }

    public List<ComprasPorProyectoVo> findComprasPorProyecto() throws SQLException {
        return comprasPorProyectoDao.find();

    }
}
