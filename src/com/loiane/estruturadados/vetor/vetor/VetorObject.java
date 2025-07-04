package com.loiane.estruturadados.vetor.vetor;

public class VetorObject {

    // 🔹 Array interno que armazena os elementos do vetor (tipo genérico Object)
    private Object[] elementos;

    // 🔹 Controla quantos elementos foram adicionados (tamanho lógico do vetor)
    private int tamanho;

    // 🔸 Construtor que define a capacidade inicial do vetor
    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade]; // cria o array com o tamanho definido
        this.tamanho = 0; // vetor começa vazio
    }

    // 🔸 Adiciona elemento ao final do vetor
    public boolean adiciona(Object elemento) {
        this.aumentaCapacidade(); // verifica se precisa aumentar capacidade antes de adicionar
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento; // adiciona no final
            this.tamanho++; // atualiza o tamanho lógico
            return true;
        }
        return false; // caso não consiga adicionar
    }

    // 🔸 Adiciona elemento em uma posição específica
    public boolean adiciona(int posicao, Object elemento) {
        // valida se a posição está dentro do intervalo válido
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade(); // aumenta capacidade se necessário

        // desloca os elementos da posição até o final uma posição para frente
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento; // insere o novo elemento
        this.tamanho++; // atualiza o tamanho lógico
        return true;
    }

    // 🔸 Método auxiliar que dobra a capacidade do array quando ele estiver cheio
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2]; // dobra o tamanho
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i]; // copia os elementos
            }
            this.elementos = elementosNovos; // substitui pelo novo array maior
        }
    }

    // 🔸 Busca um elemento pela posição (índice)
    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao]; // retorna o elemento da posição desejada
    }

    // 🔸 Remove um elemento da posição especificada
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        // desloca os elementos à direita para a esquerda para preencher o "buraco"
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        // limpa o último elemento (agora fora do tamanho lógico)
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--; // diminui o tamanho lógico
    }

    // 🔸 Busca a posição de um elemento específico (por valor)
    public int busca2(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i; // retorna a posição do primeiro elemento igual
            }
        }
        return -1; // não encontrado
    }

    // 🔸 Retorna a quantidade de elementos armazenados no vetor
    public int tamanho() {
        return this.tamanho;
    }

    // 🔸 Retorna uma representação em String do vetor, útil para debug e exibição
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(); // cria uma string eficiente
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]); // último sem vírgula
        }

        s.append("]");
        return s.toString();
    }
}
