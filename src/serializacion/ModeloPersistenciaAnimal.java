/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author T-107
 */
import java.io.*;
import java.util.ArrayList;

public class ModeloPersistenciaAnimal {
    String ruta="D://java2//animalitos.spider";
    ArrayList<Animal> animales;
    public void ModelPersistenciaAnimal(){
        animales=new ArrayList<Animal>();
    }
    public void guardar(Animal animal)throws Exception{
        //paso 1 crear el archivo donde se guarda el animal
        File file=new File(ruta);
        if(file.exists()){
            animales= buscarTodos();
        }
        
        FileOutputStream fos=new FileOutputStream(file);//linea
        ObjectOutputStream oos=new ObjectOutputStream(fos);//compresor
        animales.add(animal);
        oos.writeObject(animales);//comprime el animal
        System.out.println("Animalito comprimido con exito");
                    
            
        
        
    }
    public ArrayList<Animal> buscarTodos()throws Exception{
        Animal a=new Animal();
        File f=new File(ruta);
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        animales= (ArrayList<Animal>)ois.readObject();//casting
        return animales;
    }

}
