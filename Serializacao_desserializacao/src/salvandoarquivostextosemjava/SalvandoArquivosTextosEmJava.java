/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salvandoarquivostextosemjava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio
 */
public class SalvandoArquivosTextosEmJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Salvando arquivos txt
        
        File arquivo = new File("arquivo");
        
        try (FileWriter fw = new FileWriter(arquivo)){ // usando o try whif resource
            
            fw.write('2');
            fw.write(" - ");
            fw.write('1');
            fw.write(255);// passando um inteiro como argumento ele interpreta os codigo unicode 255 equivale a ÿ.
            
            fw.flush();
        } catch (IOException ex) {
            Logger.getLogger(SalvandoArquivosTextosEmJava.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro: " + ex.getMessage());
        }
        
    }
    
}
