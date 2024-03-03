package br.com.guilherme.javalessons.model;

public class Funcionario {
    private String name;
    private int idade;
    private String CPF;

    public Funcionario() {
    }

    public Funcionario(String name, int idade, String CPF) {
        this.name = name;
        this.idade = idade;
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
