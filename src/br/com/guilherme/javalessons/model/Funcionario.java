package br.com.guilherme.javalessons.model;

import br.com.guilherme.javalessons.model.enums.FuncionarioContrato;

public class Funcionario {
    private String name;
    private int idade;
    private String CPF;

    private FuncionarioContrato funcionarioContrato;

    public Funcionario() {
    }

    public Funcionario(String name, int idade, String CPF, FuncionarioContrato funcionarioContrato) {
        this.name = name;
        this.idade = idade;
        this.CPF = CPF;
        // Atribuição do enum referente ao contrato do funcionário
        this.funcionarioContrato = funcionarioContrato;
    }

    public FuncionarioContrato getFuncionarioContrato() {
        return funcionarioContrato;
    }

    public void setFuncionarioContrato(FuncionarioContrato funcionarioContrato) {
        this.funcionarioContrato = funcionarioContrato;
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
