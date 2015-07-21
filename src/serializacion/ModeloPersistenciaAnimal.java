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
public class ModeloPersistenciaAnimal {
    public void guardar(Animal animal)throws Exception{
        //paso 1 crear el archivo donde se guarda el animal
        File file=new File("D://java2//animalitos.spider");
        FileOutputStream fos=new FileOutputStream(file);//linea
        ObjectOutputStream oos=new ObjectOutputStream(fos);//compresor
        oos.writeObject(animal);//comprime el animal
        System.out.println("Animalito comprimido con exito");
    }

}
