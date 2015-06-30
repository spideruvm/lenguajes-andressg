/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;
/**
 *
 * @author T-107
 */
public class ModeloEvaluacion {
    public float evaluar(ExamenParcial cParcial, ExamenFinal cFinal)throws PorcentajesExeption {
        
        float pParcial=cParcial.getPorcentaje();
        float pFinal=cFinal.getPorcentaje();
        
        if((pParcial+pFinal)!=1.0f)throw new PorcentajesExeption();
        
        float calificacionFinal=cParcial.getCalificacion()*cParcial.getPorcentaje()+
                cFinal.getCalificacion()*cFinal.getPorcentaje();
        
        return calificacionFinal;        
    }   
}