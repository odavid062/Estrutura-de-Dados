package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.ListaVetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc07 extends Exerc06{


   public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ArrayList <Contato> listaVetor = new ArrayList<>(20);

            // Adiciona 5 contatos fictícios ao vetor
            criarContatosDinamicamente(5, listaVetor );

            int opcao = 1;

            while (opcao != 0) {
                opcao = obterOpcaoMenu(scanner);

                switch (opcao) {
                    case 1:
                        adicionarContatoFinal(scanner, listaVetor);
                        break;
                    case 2:
                        adicionarContatoPosicao(scanner, listaVetor);
                        break;
                    case 3:
                        obtemContatoPosicao(scanner, listaVetor);
                        break;
                    case 4:
                        obtemContato(scanner, listaVetor);
                        break;
                    case 5:
                        pesquisarUltimoIndice(scanner, listaVetor);
                        break;
                    case 6:
                        pesquisarContatoExiste(scanner, listaVetor);
                        break;
                    case 7:
                        excluirPorPosicao(scanner, listaVetor);
                        break;
                    case 8:
                        excluirContato(scanner, listaVetor);
                        break;
                    case 9:
                        imprimeTamanhoVetor(listaVetor);
                        break;
                    case 10:
                        limparVetor(listaVetor);
                        break;
                    case 11:
                        imprimirVetor(listaVetor);
                        break;
                    default:
                        break;
                }
            }

            System.out.println("Usuário digitou 0. Programa encerrado.");
        }

        private static void adicionarContatoFinal(Scanner scanner,  ArrayList<Contato> listaVetor) {
            System.out.println("Criando um contato. Entre com as informações:");
            String nome = lerInformacao("Nome: ", scanner);
            String telefone = lerInformacao("Telefone: ", scanner);
            String email = lerInformacao("Email: ", scanner);

            Contato contato = new Contato(nome, telefone, email);

            try {
                listaVetor.add(contato);
                System.out.println("✅ Contato adicionado com sucesso!");
                System.out.println(contato);
            } catch (Exception e) {
                System.out.println(" Erro: contato não adicionado.");
            }
        }

        private static void adicionarContatoPosicao(Scanner scanner,  ArrayList<Contato> listaVetor) {
            System.out.println("Criando um contato. Entre com as informações:");
            String nome = lerInformacao("Nome: ", scanner);
            String telefone = lerInformacao("Telefone: ", scanner);
            String email = lerInformacao("Email: ", scanner);

            Contato contato = new Contato(nome, telefone, email);
            int pos = lerInformacaoInt("Informe a posição onde deseja inserir o contato: ", scanner);

            try {
                listaVetor.add(pos, contato);
                System.out.println("✅ Contato adicionado com sucesso na posição " + pos + "!");
                System.out.println(contato);
            } catch (Exception e) {
                System.out.println(" Erro ao adicionar contato na posição informada.");
            }
        }

        private static void obtemContatoPosicao(Scanner scanner, ArrayList<Contato> listaVetor) {
            int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

            try {
                Contato contato = listaVetor.get(pos);
                System.out.println("Contato existe. Dados:");
                System.out.println(contato);
            } catch (Exception e) {
                System.out.println(" Posição inválida.");
            }
        }

        private static void obtemContato(Scanner scanner,  ArrayList<Contato> listaVetor) {
            int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

            try {
                Contato contato = listaVetor.get(pos);
                System.out.println("Contato existe. Dados:");
                System.out.println(contato);
                System.out.println("Fazendo pesquisa do contato encontrado...");
                int posicao = listaVetor.indexOf(contato);
                System.out.println("Contato encontrado na posição " + posicao);

            } catch (Exception e) {
                System.out.println(" Posição inválida.");
            }
        }

        private static void pesquisarUltimoIndice(Scanner scanner,  ArrayList<Contato> listaVetor) {
            int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

            try {
                Contato contato = listaVetor.get(pos);
                int ultimoIndice = listaVetor.lastIndexOf(contato);
                System.out.println("Último índice do contato: " + ultimoIndice);
            } catch (Exception e) {
                System.out.println(" Posição inválida.");
            }
        }

        private static void pesquisarContatoExiste(Scanner scanner, ArrayList<Contato> listaVetor) {
            int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

            try {
                Contato contato = listaVetor.get(pos);
                boolean existe = listaVetor.contains(contato);
                System.out.println(existe ? "Contato existe." : "Contato não encontrado.");
            } catch (Exception e) {
                System.out.println(" Posição inválida.");
            }
        }

        private static void excluirContato(Scanner scanner,  ArrayList<Contato> listaVetor) {
            int pos = lerInformacaoInt("Entre com a posição do contato a ser excluído: ", scanner);

            try {
                Contato contato = listaVetor.get(pos);
                listaVetor.remove(contato);
                System.out.println("Contato excluído com sucesso.");
            } catch (Exception e) {
                System.out.println(" Posição inválida.");
            }
        }

        private static void excluirPorPosicao(Scanner scanner,  ArrayList<Contato> listaVetor) {
            int pos = lerInformacaoInt("Entre com a posição a ser removida: ", scanner);

            try {
                listaVetor.remove(pos);
                System.out.println("Contato excluído com sucesso.");
            } catch (Exception e) {
                System.out.println(" Posição inválida.");
            }
        }

        private static void imprimeTamanhoVetor( ArrayList<Contato> listaVetor) {
            System.out.println("Tamanho atual do vetor: " + listaVetor.size());
        }

        private static void limparVetor(  ArrayList<Contato> listaVetor) {
            listaVetor.clear();
            System.out.println("Todos os contatos foram removidos.");
        }

        private static void imprimirVetor(  ArrayList<Contato> listaVetor) {
            System.out.println(listaVetor);
        }



       private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> listaVetor) {
            for (int i = 0; i < quantidade; i++) {
                Contato contato = new Contato();
                contato.setNome("Contato " + i);
                contato.setTelefone("11111" + i);
                contato.setEmail("contato" + i + "@email.com");

                listaVetor.add(contato);
            }
        }
    }
