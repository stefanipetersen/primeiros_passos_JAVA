package src.Heranca.model;

//O extends é usado para complementar a classe criada, muitas vezes uma classe base vai ser usada por muitas outras por possuir os atributos que todas precisam ter, porém se a classe nova que estou criando possui características próprias, entao só é necessário puxar a base e complementar com os novos atributos ou metodos.

public class Gerente extends Funcionario {

    public int sala;

    public int ramal;

    public double faturamentoSemestral;

    public Gerente() {super();}

    public Gerente(int sala, int ramal, double faturamentoSemestral) {
        this.sala = sala;
        this.ramal = ramal;
        this.faturamentoSemestral = faturamentoSemestral;
    }

    public Gerente(String nomes, String cpf, Enderecos enderecos, double salarioFixo, int sala, int ramal, double faturamentoSemestral) {
        super(nomes, cpf, enderecos, salarioFixo);
        this.sala = sala;
        this.ramal = ramal;
        this.faturamentoSemestral = faturamentoSemestral;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public double getFaturamentoSemestral() {
        return faturamentoSemestral;
    }

    public void setFaturamentoSemestral(double faturamentoSemestral) {
        this.faturamentoSemestral = faturamentoSemestral;
    }

    @Override
    public double getBonus() {return this.getFaturamentoSemestral() * 0.05;}

    @Override
    public String getDetalhamento(){
        return "Nome: " + this.getNomes() +
                "\nSala: " + this.getSala() +
                "\nRamal: " + this.getSala() +
                "\nEndereço: " + this.getEnderecos().getEnderecoCompleto() +
                "\nSalario Mensal: R$" + this.getSalarioFixo() +
                "\nFaturamento Semestral: R$" + this.getFaturamentoSemestral() +
                "\nBônus Semestral: " + this.getBonus();
    }
}
