package com.loiane.estruturadados.vetor.pilha.testePilha;

import pilha.Pilha;

public class Aula17 {

    public static void main(String[]srgs){

        Pilha<Integer> pilha = new Pilha<Integer>();


        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);

        System.out.println("Desempilhando o elemento " + pilha.desempilha());

        System.out.println(pilha);
    }
}
