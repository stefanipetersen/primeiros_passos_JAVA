package src.Excecoes.model;

import src.Excecoes.exception.PercentualInvalidoException;

public class Funcionarios {
    private String nome;
    private double salario;

    public void aumentarSalario(int percentual) throws PercentualInvalidoException {
        if (percentual < 0)
            throw new PercentualInvalidoException("O valor percentual deve ser positivo");
        salario += salario * percentual / 100;
    }
    public Funcionarios() {}

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}