package com.loiane.estruturadados.vetor.pilha.exercicios;


import com.loiane.estruturadados.vetor.pilha.Pilha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();
        List<Integer> numerosDigitados = new ArrayList<>();
        List<Integer> numerosEmpilhados = new ArrayList<>();
        List<Integer> numerosDesempilhadosDurante = new ArrayList<>();
        List<Integer> numerosDesempilhadosFinal = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) { // <= 10 gerava 11 entradas
            System.out.print("Entre com o elemento: ");
            int num = scanner.nextInt();
            numerosDigitados.add(num); // Aqui agora está correto

            if (num % 2 == 0) {
                System.out.println("Empilhando o número " + num);
                pilha.empilha(num);
                numerosEmpilhados.add(num);
            } else {
                Integer desempilhado = pilha.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha está vazia.");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desempilhado);
                    numerosDesempilhadosDurante.add(desempilhado);
                }
            }
        }

        System.out.println("\nResumo da execução:");
        System.out.println("Números digitados: " + numerosDigitados);
        System.out.println("Números empilhados: " + numerosEmpilhados);
        System.out.println("Números desempilhados durante o processo (ao digitar ímpares): " + numerosDesempilhadosDurante);

        System.out.println("\nDesempilhando os números restantes da pilha...");
        while (!pilha.estaVazia()) {
            Integer desempilhado = pilha.desempilha();
            numerosDesempilhadosFinal.add(desempilhado);
            System.out.println("Desempilhando: " + desempilhado);
        }

        System.out.println("\nNúmeros desempilhados no final: " + numerosDesempilhadosFinal);
        System.out.println("Todos os elementos foram desempilhados.");
    }
}
