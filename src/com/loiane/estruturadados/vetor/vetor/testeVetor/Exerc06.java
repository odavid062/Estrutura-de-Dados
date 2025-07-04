package com.loiane.estruturadados.vetor.vetor.testeVetor;

import com.loiane.estruturadados.vetor.vetor.ListaVetor;
import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaVetor<Contato> listaVetor = new ListaVetor<>(20);

        // Adiciona 5 contatos fictícios ao vetor
        criarContatosDinamicamente(5, listaVetor);

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

    private static void adicionarContatoFinal(Scanner scanner, ListaVetor<Contato> listaVetor) {
        System.out.println("Criando um contato. Entre com as informações:");
        String nome = lerInformacao("Nome: ", scanner);
        String telefone = lerInformacao("Telefone: ", scanner);
        String email = lerInformacao("Email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);

        try {
            listaVetor.adiciona(contato);
            System.out.println("✅ Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println(" Erro: contato não adicionado.");
        }
    }

    private static void adicionarContatoPosicao(Scanner scanner, ListaVetor<Contato> listaVetor) {
        System.out.println("Criando um contato. Entre com as informações:");
        String nome = lerInformacao("Nome: ", scanner);
        String telefone = lerInformacao("Telefone: ", scanner);
        String email = lerInformacao("Email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);
        int pos = lerInformacaoInt("Informe a posição onde deseja inserir o contato: ", scanner);

        try {
            listaVetor.adiciona(pos, contato);
            System.out.println("✅ Contato adicionado com sucesso na posição " + pos + "!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println(" Erro ao adicionar contato na posição informada.");
        }
    }

    private static void obtemContatoPosicao(Scanner scanner, ListaVetor<Contato> listaVetor) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

        try {
            Contato contato = listaVetor.busca(pos);
            System.out.println("Contato existe. Dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println(" Posição inválida.");
        }
    }

    private static void obtemContato(Scanner scanner, ListaVetor<Contato> listaVetor) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

        try {
            Contato contato = listaVetor.busca(pos);
            System.out.println("Contato existe. Dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do contato encontrado...");
            int posicao = listaVetor.indiceDe(contato);
            System.out.println("Contato encontrado na posição " + posicao);

        } catch (Exception e) {
            System.out.println(" Posição inválida.");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scanner, ListaVetor<Contato> listaVetor) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

        try {
            Contato contato = listaVetor.busca(pos);
            int ultimoIndice = listaVetor.ultimoIndice(contato);
            System.out.println("Último índice do contato: " + ultimoIndice);
        } catch (Exception e) {
            System.out.println(" Posição inválida.");
        }
    }

    private static void pesquisarContatoExiste(Scanner scanner, ListaVetor<Contato> listaVetor) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

        try {
            Contato contato = listaVetor.busca(pos);
            boolean existe = listaVetor.contem(contato);
            System.out.println(existe ? "Contato existe." : "Contato não encontrado.");
        } catch (Exception e) {
            System.out.println(" Posição inválida.");
        }
    }

    private static void excluirContato(Scanner scanner, ListaVetor<Contato> listaVetor) {
        int pos = lerInformacaoInt("Entre com a posição do contato a ser excluído: ", scanner);

        try {
            Contato contato = listaVetor.busca(pos);
            listaVetor.remove(contato);
            System.out.println("Contato excluído com sucesso.");
        } catch (Exception e) {
            System.out.println(" Posição inválida.");
        }
    }

    private static void excluirPorPosicao(Scanner scanner, ListaVetor<Contato> listaVetor) {
        int pos = lerInformacaoInt("Entre com a posição a ser removida: ", scanner);

        try {
            listaVetor.remove(pos);
            System.out.println("Contato excluído com sucesso.");
        } catch (Exception e) {
            System.out.println(" Posição inválida.");
        }
    }

    private static void imprimeTamanhoVetor(ListaVetor<Contato> listaVetor) {
        System.out.println("Tamanho atual do vetor: " + listaVetor.tamanho());
    }

    private static void limparVetor(ListaVetor<Contato> listaVetor) {
        listaVetor.limpar();
        System.out.println("Todos os contatos foram removidos.");
    }

    private static void imprimirVetor(ListaVetor<Contato> listaVetor) {
        System.out.println(listaVetor);
    }

    protected static String lerInformacao(String msg, Scanner scanner) {
        System.out.print(msg);
        return scanner.nextLine();
    }

    protected static int lerInformacaoInt(String msg, Scanner scanner) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.print(msg);
                String entrada = scanner.nextLine();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println(" Entrada inválida. Digite um número inteiro válido.");
            }
        }

        return num;
    }

    protected static int obterOpcaoMenu(Scanner scanner) {
        boolean entradaValida = false;
        int opcao = 0;

        while (!entradaValida) {
            System.out.println("\n================ MENU =================");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtem contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Remove por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");
            System.out.println("=======================================");

            try {
                String entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    System.out.println(" Opção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println(" Erro ao ler a opção. Digite um número válido.");
            }
        }
        return opcao;
    }

    protected static void criarContatosDinamicamente(int quantidade, ListaVetor<Contato> listaVetor) {
        for (int i = 0; i < quantidade; i++) {
            Contato contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("11111" + i);
            contato.setEmail("contato" + i + "@email.com");

            listaVetor.adiciona(contato);
        }
    }
}