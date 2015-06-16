/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UncheckedExeceptions;

/**
 *
 * @author T-107
 */
public class ProbarExepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //examen Arithmetic Exception
        float a=5;
        int b=0;
        System.out.println(""+a*b);
        System.out.println(""+a/b);
        System.out.println(a-b);
        
        //Number Formal Exepction(formato diferente)
        /*
        Integer i= new Integer("hola");
        int otro=5;
        System.out.println(i+otro);
        */
        
        int []m={2,5,6,7};
        System.out.println(""+m[4]);
        
    }
    
}
