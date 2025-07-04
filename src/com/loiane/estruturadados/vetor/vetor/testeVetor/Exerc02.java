package com.loiane.estruturadados.vetor.vetor.testeVetor;

import com.loiane.estruturadados.vetor.vetor.ListaVetor;
import java.util.ArrayList;

public class Exerc02 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println("Última posição de 'A' no ArrayList: " + arrayList.lastIndexOf("A"));

        ListaVetor<String> listaVetor = new ListaVetor<>(5);
        listaVetor.adiciona("A");
        listaVetor.adiciona("B");
        listaVetor.adiciona("A");

        System.out.println("Última posição de 'A' no ListaVetor: " + listaVetor.ultimoIndice("A"));
    }
}
