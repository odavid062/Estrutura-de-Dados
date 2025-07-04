package com.loiane.estruturadados.vetor.fila.testeFila;


import com.loiane.estruturadados.vetor.fila.Fila;

public class Aula21 {

    public static void main(String[] args){

        Fila<Integer> fila = new Fila<>();

      fila.enfileira(1);
      fila.enfileira(2);


        System.out.println(fila.espiar());
        System.out.println(fila.toString());
    }
}
