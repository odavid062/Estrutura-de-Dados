package com.loiane.estruturadados.vetor.pilha.exercicios;

import java.util.Stack;

public class Exerc04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("Quando Nietzsche Chorou");
        livro1.setAutor("Irvin D. Yalom");
        livro1.setAnoLancamento(2005);
        livro1.setIsbn("8500007958");

        Livro livro2 = new Livro();
        livro2.setNome("Além do Bem e do Mal - Nietzsche: Prelúdio a uma filosofia do futuro");
        livro2.setAutor("Friedrich Nietzsche (1844-1900)");
        livro2.setAnoLancamento(1891);
        livro2.setIsbn("978-8552100430");

        Livro livro3 = new Livro();
        livro3.setNome("Assim falou Zaratustra");
        livro3.setAutor("Friedrich Wilhelm Nietzsche (1844-1900)");
        livro3.setAnoLancamento(1889);
        livro3.setIsbn("8552101238");

        Livro livro4 = new Livro();
        livro4.setNome("A Gaia Ciência");
        livro4.setAutor("Friedrich Wilhelm Nietzsche (1844-1900)");
        livro4.setAnoLancamento(1882);
        livro4.setIsbn("8535920668");

        Livro livro5 = new Livro();
        livro5.setNome("Genealogia da Moral");
        livro5.setAutor("Friedrich Wilhelm Nietzsche (1844-1900)");
        livro5.setAnoLancamento(1888);
        livro5.setIsbn("8535914560");

        Livro livro6 = new Livro();
        livro6.setNome("O Anticristo");
        livro6.setAutor("Friedrich Wilhelm Nietzsche (1844-1900)");
        livro6.setAnoLancamento(1888);
        livro6.setIsbn("8525417912");

        System.out.println("Pilha de livros criada. A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Empilhando livros na pilha...");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        pilha.push(livro6);

        System.out.println(pilha.size() + " livros foram empilhados.");
        System.out.println("Após empilhar, a pilha está vazia? " + pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando livros da pilha:");
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livro: " + pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhados. Pilha está vazia? " + pilha.isEmpty());
    }
}




