package com.edgar.reto5.model.vo;

/**
 *
 * @author beelz
 */
public class ProyectosPorClasificacionVo {
    
    private Integer ID_Proyecto;
    private String Constructora;
    private Double Numero_Habitaciones;
    private String Ciudad;

    public ProyectosPorClasificacionVo() {
    }

    public ProyectosPorClasificacionVo(Integer ID_Proyecto, String Constructora, Double Numero_Habitaciones, String Ciudad) {
        this.ID_Proyecto = ID_Proyecto;
        this.Constructora = Constructora;
        this.Numero_Habitaciones = Numero_Habitaciones;
        this.Ciudad = Ciudad;
    }

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public Double getNumero_Habitaciones() {
        return Numero_Habitaciones;
    }

    public void setNumero_Habitaciones(Double Numero_Habitaciones) {
        this.Numero_Habitaciones = Numero_Habitaciones;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
}
