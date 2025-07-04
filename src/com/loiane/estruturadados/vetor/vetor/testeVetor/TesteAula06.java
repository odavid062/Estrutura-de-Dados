package com.loiane.estruturadados.vetor.vetor.testeVetor;

import com.loiane.estruturadados.vetor.vetor.Vetor;

public class TesteAula06 {

    public static void main (String[]args ){
        Vetor vetor = new Vetor(10);

        vetor.adiciona("1");
        vetor.adiciona("2");
        vetor.adiciona("3");

        System.out.println(vetor.busca2("10"));

    }
}
