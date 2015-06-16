/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Animal raro=new Animal();
            raro.setEdad(2);
            raro.setNombre("Rareza");
        ya no cre objetos de una clase*/
        Tortuga animal1=new Tortuga();
            animal1.setNombre("japonesa");
            animal1.setEdad(12);
        Leon animal2=new Leon();
            animal2.setNombre("africano");
            animal2.setEdad(20);
        Delfin animal3=new Delfin();
            animal3.setNombre("chino");
            animal3.setEdad(21);
    }
    
}
