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
    List<Usuario> usuarios;
    
    public GeneradorDeUsuarios(){
        Usuario u1=new Usuario("juan", 42, "jc@gmail.com");
        Usuario u2=new Usuario("ana", 22, "as@ssdd");
        Usuario u3=new Usuario("pedroi", 33, "ada@dfd");
        usuarios=new ArrayList<Usuario>();
        
    }

    public List<Usuario> getUsuarios() {//una lista de usuarios
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
