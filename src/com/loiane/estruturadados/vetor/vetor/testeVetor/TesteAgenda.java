package com.loiane.estruturadados.vetor.vetor.testeVetor;


import com.loiane.estruturadados.vetor.vetor.VetorObject;

public class TesteAgenda {

    public static void main(String[] args) {

        VetorObject agenda = new VetorObject(3); // agenda começa com capacidade 3

        // Criando contatos
        Contato c1 = new Contato("Naruto Uzumaki", "9999-0001", "naruto@konoha.com");
        Contato c2 = new Contato("Sasuke Uchiha", "9999-0002", "sasuke@uchiha.com");
        Contato c3 = new Contato("Sakura Haruno", "9999-0003", "sakura@mednin.com");
        Contato c4 = new Contato("Kakashi Hatake", "9999-0004", "kakashi@copy.com");

        // Adicionando à agenda
        agenda.adiciona(c1);
        agenda.adiciona(c2);
        agenda.adiciona(c3);
        agenda.adiciona(c4); // força aumento de capacidade (teste!)

        // Listando todos os contatos
        System.out.println("Contatos da agenda:");
        for (int i = 0; i < agenda.tamanho(); i++) {
            System.out.println(agenda.busca(i));
        }

        // Buscando por um contato específico
        Contato procurado = new Contato("Sasuke Uchiha", "9999-0002", "sasuke@uchiha.com");
        int posicao = agenda.busca2(procurado);

        if (posicao >= 0) {
            System.out.println("\nContato encontrado na posição: " + posicao);
        } else {
            System.out.println("\nContato não encontrado.");
        }

        // Removendo o contato encontrado
        if (posicao >= 0) {
            agenda.remove(posicao);
            System.out.println("\nContato removido. Lista atualizada:");
            for (int i = 0; i < agenda.tamanho(); i++) {
                System.out.println(agenda.busca(i));
            }
        }
    }
}
