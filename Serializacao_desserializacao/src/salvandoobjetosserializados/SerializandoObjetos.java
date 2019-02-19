/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salvandoobjetosserializados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio
 */
public class SerializandoObjetos {
    public static void serializa(ArrayList<Object> serializa, String nomeArq){
        File arq = new File(nomeArq);
        try{
            arq.delete();
            arq.createNewFile();
            try (ObjectOutputStream serializaObj = new ObjectOutputStream(new FileOutputStream(arq))) {
                serializaObj.writeObject(serializa);
            }
            
        }catch(IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
    public static ArrayList<Object> desserializacao(String nome){
        ArrayList<Object> lista = new ArrayList<>();
            
        try{
            File arq = new File(nome);
            if(arq.exists()){
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream(arq));
                lista = (ArrayList<Object>) obj.readObject();
                obj.close();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializandoObjetos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(SerializandoObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
