package com.loiane.estruturadados.vetor.vetor.testeVetor;

import com.loiane.estruturadados.vetor.vetor.ListaVetor;

public class Exerc03 {

    public static void main(String[] args) {

        ListaVetor<String> listaVetor = new ListaVetor<>(5);

        listaVetor.adiciona("A");
        listaVetor.adiciona("B");
        listaVetor.adiciona("C");
        listaVetor.adiciona("D");
        listaVetor.adiciona("E");

        System.out.println(listaVetor); // [A, B, C, D, E]

        listaVetor.remove("A");
        System.out.println(listaVetor); // [B, C, D, E]

        listaVetor.remove("C");
        System.out.println(listaVetor); // [B, D, E]

        listaVetor.remove("C"); // não existe mais, então nada muda
        System.out.println(listaVetor); // [B, D, E]
    }
}
