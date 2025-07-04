package com.loiane.estruturadados.vetor.vetor.testeVetor;

import com.loiane.estruturadados.vetor.vetor.ListaVetor;

public class Exerc05 {

    public static void main(String[] args) {

        ListaVetor<String> arrayList = new ListaVetor<String>(5);

        arrayList.adiciona("A");
        arrayList.adiciona("B");
        arrayList.adiciona("C");
        arrayList.adiciona("D");
        arrayList.adiciona("E");

        System.out.println(arrayList); // [A, B, C, D, E]

        arrayList.limpar(); // limpa a lista

        System.out.println(arrayList); // []

        ListaVetor<String> listaVetor = new ListaVetor<String>(5);

        listaVetor.adiciona("A");
        listaVetor.adiciona("B");
        listaVetor.adiciona("C");
        listaVetor.adiciona("D");
        listaVetor.adiciona("E");

        System.out.println(listaVetor); // [A, B, C, D, E]

        listaVetor.limpar();

        System.out.println(listaVetor);

    }
}
