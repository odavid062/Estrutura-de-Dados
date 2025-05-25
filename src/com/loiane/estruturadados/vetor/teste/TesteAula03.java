package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class TesteAula03 {

    public static void main(String[]args ){

        Vetor vetor = new Vetor(10);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4"); // Aqui queremos ver o que acontece

        System.out.println("Execução concluída!");

    }
}
