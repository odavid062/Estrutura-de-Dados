package com.loiane.estruturadados.vetor.pilha.testePilha;

import pilha.Pilha;

import java.util.Stack;

public class Aula18 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        Stack<Integer> stack = new Stack<Integer>();

        // Verifica se a pilha está vazia (true se vazia)
        System.out.println(stack.empty());

        // push adiciona (empilha) um elemento no topo da pilha
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Verifica se a pilha está vazia (true se vazia)
        System.out.println(stack.isEmpty());

        // size retorna o número de elementos na pilha
        System.out.println(stack.size());

        // toString retorna a representação em String da pilha
        System.out.println(stack);

        // peek retorna o elemento do topo sem removê-lo (espiar)
        System.out.println(stack.peek());

        // pop remove e retorna o elemento do topo da pilha
        System.out.println(stack.pop());

        // Imprime o estado atual da pilha após o pop
        System.out.println(stack);

    }

}
