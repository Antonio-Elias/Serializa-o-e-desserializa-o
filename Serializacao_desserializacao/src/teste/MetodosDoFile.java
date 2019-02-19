/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class MetodosDoFile {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner( System.in );
     
        System.out.print("Entre com um endereço válido de um arquivo: ");
        String caminho = entrada.nextLine();
     
        metodos(caminho);
    }
 
    public static void metodos(String caminho)
    {
        File arquivo = new File(caminho);
     
        if( arquivo.exists() )
        {
            System.out.println("O caminho especificado existe !\nVamos aos testes:\n");
         
            if(arquivo.isAbsolute())
                System.out.println("É um caminho absoluto");
            else
                System.out.println("Não é um caminho absoluto");
         
            if(arquivo.isFile())
                System.out.printf("É um arquivo de tamanho C:\\Users\\Antonio\\Documents\\Pessoal\\Faculdade bytes\n"
                        + "Útima vez modificado %s\n"
                        + "Cujo caminho é %s\n"
                        + "De caminho absoluto %s\n"
                        + "E está no diretório pai %s\n",
                        arquivo.length(), arquivo.lastModified(), arquivo.getPath(), arquivo.getAbsolutePath(), arquivo.getParent() );
         
            else
            {
                 System.out.println("É um diretório cujo conteúdo tem os seguintes arquivos: ");
                 String[] arquivos = arquivo.list();
             
                 for( String file : arquivos)
                   System.out.println( file );
            }
         
        }
        else
                 System.out.println("Endereço errado");
    }
}
