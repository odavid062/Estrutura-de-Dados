package com.loiane.estruturadados.vetor.vetor.testeVetor;

import com.loiane.estruturadados.vetor.vetor.ListaVetor;

public class Exerc04 {


    public static void main (String[]args){


        ListaVetor<String> listaVetor = new ListaVetor<String>(5);

        listaVetor.adiciona("A");
        listaVetor.adiciona("B");
        listaVetor.adiciona("C");
        listaVetor.adiciona("D");
        listaVetor.adiciona("E");

        System.out.println(listaVetor.obtem(0));
        System.out.println(listaVetor.obtem(2));
        System.out.println(listaVetor.obtem(4));

    }

}
