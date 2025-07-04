package com.loiane.estruturadados.vetor.vetor.testeVetor;

// Classe que representa um contato com nome, telefone e email
public class Contato {

    // Atributos privados (encapsulados)
    private String nome;
    private String telefone;
    private String email;

    // Construtor vazio (padrão)
    public Contato() {
    }

    // Construtor com todos os campos (opcional)
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getter (leitor) do nome
    public String getNome() {
        return nome;
    }

    // Setter (modificador) do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter do telefone
    public String getTelefone() {
        return telefone;
    }

    // Setter do telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Getter do email
    public String getEmail() {
        return email;
    }

    // Setter do email
    public void setEmail(String email) {
        this.email = email;
    }

    // Para exibir o contato de forma legível
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
