package com.edgar.reto5.model.vo;

/**
 *
 * @author beelz
 */
public class InfoLiderVo {
    
    private Integer ID_Lider;
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;

    public InfoLiderVo() {
    }

    public InfoLiderVo(Integer ID_Lider, String Nombre, String Primer_Apellido, String Ciudad_Residencia) {
        this.ID_Lider = ID_Lider;
        this.Nombre = Nombre;
        this.Primer_Apellido = Primer_Apellido;
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public Integer getID_Lider() {
        return ID_Lider;
    }

    public void setID_Lider(Integer ID_Lider) {
        this.ID_Lider = ID_Lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia) {
        this.Ciudad_Residencia = Ciudad_Residencia;
    }
   
}
