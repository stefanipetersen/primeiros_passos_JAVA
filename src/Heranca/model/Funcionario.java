package src.Heranca.model;


//Uma classe abstrata se diferencia das outras por não poder ser instanciada diretamente, isso garante uma segurança da alteração dos atributos e até mesmo privacidade de dados, fazendo o sistema só chamar o metodo ou atributo exato que ele precisa.

public abstract class Funcionario {

    private String nomes;

    private String cpf;

    private Enderecos enderecos;

    private double salarioFixo;

    public Funcionario() {
    }

    public Funcionario(String nomes, String cpf, Enderecos enderecos, double salarioFixo) {
        this.nomes = nomes;
        this.cpf = cpf;
        this.enderecos = enderecos;
        this.salarioFixo = salarioFixo;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Enderecos getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Enderecos enderecos) {
        this.enderecos = enderecos;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public abstract double getBonus();

    public abstract String getDetalhamento();


}
