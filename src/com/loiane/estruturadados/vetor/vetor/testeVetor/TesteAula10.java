package com.loiane.estruturadados.vetor.vetor.testeVetor;

import com.loiane.estruturadados.vetor.vetor.VetorObject;

public class TesteAula10 {

    public static void main(String[]args){

        VetorObject vetor = new VetorObject(3);

        vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(5);

        System.out.println("Tamanho = "+ vetor.tamanho());

        System.out.println(vetor);
    }
}
