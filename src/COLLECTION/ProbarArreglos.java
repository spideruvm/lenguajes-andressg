/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COLLECTION;
import java.util.*;

/**
 *
 * @author T-107
 */
public class ProbarArreglos {
    public static void main(String[] args){
        GeneradorDeUsuarios generadora=new GeneradorDeUsuarios();
        generadora.agregarUsuario("chana", 18, "chana@yo.com");//agregar usuario
        ArrayList<Usuario> usuario=(ArrayList<Usuario>) generadora.getUsuarios();
        System.out.println( usuario.size());//metodo size el tamaño el arreglo
        for (Usuario u:usuario){
            System.out.println(u.getNombre()+" "+ u.getEdad()+" "+u.getEmail());
        }
    }
        
    
}
