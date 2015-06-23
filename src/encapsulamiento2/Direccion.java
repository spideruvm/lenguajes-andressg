/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento2;

/**
 *
 * @author T-107
 */
class Direccion {
    private String calle;
    private int numero;
    private String colonia;
    private String direccion;
    private int cp;
    private String municipio;
    //constructor que inicializa el cp
    public Direccion(int cp ){
        this.cp=cp;
    }
    //constructor que inicializa el cp y municipio
    public Direccion(int cp, String municipio){
        this.cp=cp;
        this.municipio=municipio;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
}
