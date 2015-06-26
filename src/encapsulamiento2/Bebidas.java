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
class Bebidas {
    String tipo;
    String[] bebibas;
    
    public String[] obtenerRecomendaciones(){
        if(tipo.equals("alcoholicas")){//equals para comparar string
            String []alcohol={"indio","sol","tecate","pulque","tonaya"};
            return alcohol;
        }
        else{
             String []sinalcohol={"agua","coca","pepesi","fanta","manzana"};
             return sinalcohol;
        }
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebibas() {
        return bebibas;
    }

    public void setBebibas(String[] bebibas) {
        this.bebibas = bebibas;
    }
    
}
