package com.loiane.estruturadados.vetor.vetor;

// 💬 Classe Vetor: estrutura de dados básica que armazena elementos em um array dinâmico
public class Vetor {

    private String[] elementos; // 💬 Array de Strings para armazenar os dados
    private int tamanho;        // 💬 Número de elementos atualmente armazenados

    // 💬 Construtor: inicializa o vetor com uma capacidade inicial
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*
    Versão inicial de adiciona() (forçando encontrar posição nula manualmente).
    Essa versão foi substituída por métodos mais inteligentes que controlam 'tamanho'.
    */

    /*
    Segunda versão (adiciona com Exception): melhor ainda, mas você quis melhorar mais e automatizar expansão.
    */

    // 💬 Versão final: adiciona elemento e expande capacidade automaticamente
    public boolean adiciona(String elemento) {
        this.aumentaCapacidade(); // Verifica e dobra a capacidade se necessário
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // 💬 Adiciona elemento em posição específica, movendo os outros para frente
    public boolean adiciona(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posi\u00e7\u00e3o inv\u00e1lida");
        }

        this.aumentaCapacidade();

        // Move os elementos para frente, abrindo espaço na posição desejada
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    // 💬 Aumenta capacidade do vetor se necessário (dobrando o tamanho)
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    // 💬 Busca elemento pela posição (índice)
    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

// B D E F F  -> posicção a ser removida é 1 (G)
// 0 1 2 3 4  -> tamanho do vetor é 5
// vetor [1] = vetor [2]
// vetor [2] = vetor [3]
// vetor [3] = vetor [4]
public void remove(int posicao ){
    if (!(posicao >= 0 && posicao < tamanho )) {
        throw new IllegalArgumentException("Posicão invalida ");
 }
    for (int i = posicao; i<this.tamanho-1 ; i++) {
        this.elementos[i] = this.elementos[i+1];
    }
    this.tamanho--;

}



    // 💬 Busca elemento pelo valor (conteúdo)
    public int busca2(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1; // Não encontrou
    }

    // 💬 Retorna o tamanho atual (quantidade de elementos válidos no vetor)
    public int tamanho() {
        return this.tamanho;
    }

    // 💬 Representa o vetor como uma String bonita para exibição
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }
}
