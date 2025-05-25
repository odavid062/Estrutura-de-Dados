package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class ListaVetor<T> {

    // Array que armazena os elementos da lista
    private T[] elementos;

    // Quantidade de elementos adicionados (tamanho lógico da lista)
    private int tamanho;

    // Construtor padrão usando casting (gera warning, mas funciona)
    @SuppressWarnings("unchecked")
    public ListaVetor(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // Construtor alternativo usando reflexão para evitar warning
    public ListaVetor(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    // Adiciona um elemento no final da lista
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // Adiciona um elemento em uma posição específica
    public boolean adiciona(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println(" Posição inválida para inserção: " + posicao);
            return false;
        }

        this.aumentaCapacidade();

        // Move os elementos para frente a partir da posição
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    // Aumenta a capacidade do array interno (dobra o tamanho atual)
    @SuppressWarnings("unchecked")
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novosElementos[i] = this.elementos[i];
            }
            this.elementos = novosElementos;
        }
    }

    // Busca um elemento pela posição (índice)
    public T busca(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println(" Posição de busca inválida: " + posicao);
            return null;
        }
        return this.elementos[posicao];
    }

    // Remove um elemento pela posição (índice)
    public boolean remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println(" Posição inválida para remoção: " + posicao);
            return false;
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
        return true;
    }

    // Retorna a posição do primeiro elemento igual ao informado
    public int indiceDe(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Verifica se o elemento está presente na lista
    public boolean contem(T elemento) {
        int posicao = indiceDe(elemento);
        if (posicao > -1) {
            return true;
        }
        return false;
    }

    // Retorna a última posição em que o elemento aparece
    public int ultimoIndice(T elemento) {
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Remove o primeiro elemento igual ao informado
    public boolean remove(T elemento) {
        int posicao = this.indiceDe(elemento);
        if (posicao > -1) {
            this.remove(posicao); // remove pela posição
            return true;
        } else {
            System.out.println(" Elemento '" + elemento + "' não encontrado na lista.");
            return false;
        }
    }

    // Retorna o número de elementos armazenados
    public int tamanho() {
        return this.tamanho;
    }

    // Representa a lista como uma string (útil para exibição)
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    // Método utilitário para acessar elementos via nome alternativo
    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    // Limpa todos os elementos da lista (zera todos os valores e o tamanho)
    public void limpar() {
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }
}
