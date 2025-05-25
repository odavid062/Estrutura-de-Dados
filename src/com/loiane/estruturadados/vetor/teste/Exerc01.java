package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.ListaVetor;

public class Exerc01 {

    public static void main (String[]args ){

        ListaVetor<String> listaVetor = new ListaVetor<String>(5);

        listaVetor.adiciona("A");
        listaVetor.adiciona("B");
        listaVetor.adiciona("C");

        System.out.println(listaVetor.contem("A"));
        System.out.println(listaVetor.contem("B"));
        System.out.println(listaVetor.contem("E"));
    }
}
