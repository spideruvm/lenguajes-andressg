/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class InterfazCompresora {
    public static void main(String[] args){
        Animal a=new Animal();
        a.setNombre("leon");
        a.setCarnivoro(true);
        ModeloPersistenciaAnimal modelo=new ModeloPersistenciaAnimal();
        try {
            modelo.guardar(a);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
