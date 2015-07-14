/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COLLECTION;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class GeneradorDeUsuarios {
    private List<Usuario> usuarios;
    
    public GeneradorDeUsuarios(){
        Usuario u1=new Usuario("juan", 42, "jc@gmail.com");
        Usuario u2=new Usuario("ana", 22, "as@ssdd");
        Usuario u3=new Usuario("pedroi", 33, "ada@dfd");
        Usuario u4=new Usuario("pancha", 60, "pancha@hot.com");
        usuarios=new ArrayList<Usuario>();//inicializa el array
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        
    }

    public List<Usuario> getUsuarios() {//una lista de usuarios
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    //metodo para agregar usuario
    public String agregarUsuario(String nombre, int edad, String email){
       Usuario u=new Usuario(nombre, edad, email);
       usuarios.add(u);
       return("usuario agregado con exito");
    }
    
}
