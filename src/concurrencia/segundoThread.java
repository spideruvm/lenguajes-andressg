/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class segundoThread extends Thread{
    public void run(){
        while (true){
            
        
        try{
            Thread.sleep(1000);
            System.out.println("yo soy el segundo thread");
        }catch(InterruptedException e){
            
            }
            
        }
    }    
}
