package com.loiane.estruturadados.vetor.vetor.testeVetor;

import com.loiane.estruturadados.vetor.vetor.ListaVetor;


public class TesteAula11 {

    public static void main(String[] args) {

        // Cria vetor com capacidade inicial 1
        ListaVetor<Contato> vetor = new ListaVetor<>(1);

        // Cria um contato
        Contato c1 = new Contato("Naruto Uzumaki", "9999-0001", "naruto@konoha.com");

        // Adiciona no vetor
        vetor.adiciona(c1);

        // Mostra o resultado
        System.out.println("Contato adicionado.");
        System.out.println("Contato: " + vetor.busca(0)); // pega o primeiro contato adicionado
    }
}
