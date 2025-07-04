package com.loiane.estruturadados.vetor.pilha.exercicios;


import com.loiane.estruturadados.vetor.pilha.Pilha;

public class Exerc05 {
    public static void main(String[] args) {


            imprimeResultado("ADA");
            imprimeResultado("A B C D");
            imprimeResultado("A B C C B A");
            imprimeResultado("Maria");
        }

        public static void imprimeResultado(String palavra) {
            System.out.println("\"" + palavra + "\" é palíndromo? " + testaPalindromo(palavra));
        }

    public static boolean testaPalindromo(String palavra) {


        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));

        }

        String palavraInversa = "";
        while (!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;
    }
}
