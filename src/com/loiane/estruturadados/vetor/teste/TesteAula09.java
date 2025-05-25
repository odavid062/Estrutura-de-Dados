package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class TesteAula09 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remove(1); // remove G

        System.out.println(vetor);

        int pos = vetor.busca2("E"); // Corrigido: "E" como String

        if (pos > -1){
            vetor.remove(pos);
        } else {
            System.out.println("Elemento E não existe no vetor ");
        }

        System.out.println(vetor); // mostra vetor final
    }
}
