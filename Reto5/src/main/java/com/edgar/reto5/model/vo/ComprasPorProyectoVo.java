package com.edgar.reto5.model.vo;

/**
 *
 * @author beelz
 */
public class ComprasPorProyectoVo {
    
    private Integer ID_Compra;
    private String Constructura;
    private String Banco_Vinculado;

    public ComprasPorProyectoVo() {
    }

    public ComprasPorProyectoVo(Integer ID_Compra, String Constructura, String Banco_Vinculado) {
        this.ID_Compra = ID_Compra;
        this.Constructura = Constructura;
        this.Banco_Vinculado = Banco_Vinculado;
    }

    public Integer getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(Integer ID_Compra) {
        this.ID_Compra = ID_Compra;
    }

    public String getConstructura() {
        return Constructura;
    }

    public void setConstructura(String Constructura) {
        this.Constructura = Constructura;
    }

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String Banco_Vinculado) {
        this.Banco_Vinculado = Banco_Vinculado;
    }
    
}
