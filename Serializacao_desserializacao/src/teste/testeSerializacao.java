/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import bjetos.ObjetoASerSerializado;
import java.util.ArrayList;
import salvandoobjetosserializados.SerializandoObjetos;

/**
 *
 * @author Antonio
 */
public class testeSerializacao {
    public static void main(String[] args) {
        ObjetoASerSerializado ob1 = new ObjetoASerSerializado("Antonio", 27);
        ObjetoASerSerializado ob2 = new ObjetoASerSerializado("Debora", 23);
        ObjetoASerSerializado ob3 = new ObjetoASerSerializado("Davi", 10);
        ObjetoASerSerializado ob4 = new ObjetoASerSerializado("Maria", 10);
        ObjetoASerSerializado ob5 = new ObjetoASerSerializado("Dani", 6);
        
        ArrayList<Object> ser = new ArrayList<>();
        ser.add(ob1);
        ser.add(ob2);
        ser.add(ob3);
        ser.add(ob4);
        ser.add(ob5);
        
        SerializandoObjetos.serializa(ser, "arquivo");
        
        ArrayList<Object> lista1 = new ArrayList();
        
        lista1 = SerializandoObjetos.desserializacao("arquivo");
        for (Object object : lista1) {
            System.out.println("----------------------------------------------------");
            System.out.println("Nome: " + ((ObjetoASerSerializado)object).getNome());
            System.out.println("Nome: " + ((ObjetoASerSerializado)object).getIdade());
        }
                
    }
}
