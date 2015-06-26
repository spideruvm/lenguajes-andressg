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
public class Antro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Direccion d1=new Direccion(5513,"ecatepec");
     Usuario u =new Usuario("juan",43,"jcampos@gmail",new Direccion(55130,"ecatepec"));
     //impime municipio con invocacion
        System.out.println(u.getDireccion().getMunicipio());
        //UsuarioMayor mayor=new UsuarioMayor();
        
        Bebidas bebida=new Bebidas();
        bebida.setTipo("alcoholicas");
        String []reco=bebida.obtenerRecomendaciones();
        for(String be:reco){
            System.out.println("Bebida "+be);
        }
      
    }
    
}
