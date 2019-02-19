/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhandoComFluxoBytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Antonio
 */
public class EscrevendoEmBytes {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Antonio\\Documents\\Pessoal\\Faculdade\\Java\\"
                                + "Projetos\\Projetos estudos\\ArquivosParaLerJava\\Java.bin");
        
        try(OutputStream os = new FileOutputStream(arquivo)){
            byte[] b = {50,51,52,53};
            String string = "Antoniol Elias";
            os.write(53);
            os.write(b);
            os.write( string.getBytes());
            os.flush();
        }catch(IOException ex){
            ex.getStackTrace();
        } 
       try(InputStream is = new FileInputStream(arquivo)){
           int content;
           while((content = is.read()) != -1){
               System.out.println(content + " - " + ((char) content));
           }
               
       }catch(IOException ex){
            ex.getStackTrace();
        } 
    }
}
