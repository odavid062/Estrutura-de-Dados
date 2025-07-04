package com.loiane.estruturadados.vetor.pilha.exercicios;


import com.loiane.estruturadados.vetor.pilha.Pilha;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 10; i++) {
            System.out.print( " Digite um número: ");
            int num = scanner.nextInt();

            if (num == 0) {
                // Desempilhar das duas pilhas
                Integer desempilhadoPar = par.desempilha();
                if (desempilhadoPar == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhadoPar);
                }

                Integer desempilhadoImpar = impar.desempilha();
                if (desempilhadoImpar == null) {
                    System.out.println("Pilha ímpar vazia");
                } else {
                    System.out.println("Desempilhando da pilha ímpar: " + desempilhadoImpar);
                }
            } else if (num % 2 == 0) {
                System.out.println("Número par, empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Número ímpar, empilhando na pilha ímpar: " + num);
                impar.empilha(num);
            }
        }

        // Desempilhar tudo ao final
        System.out.println("Desempilhando todos os números da pilha par:");
        while (!par.estaVazia()) {
            System.out.println("Desempilhando da pilha par: " + par.desempilha());
        }

        System.out.println("Desempilhando todos os números da pilha ímpar:");
        while (!impar.estaVazia()) {
            System.out.println("Desempilhando da pilha ímpar: " + impar.desempilha());
        }

        scanner.close();
    }
}
