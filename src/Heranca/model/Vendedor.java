package src.Heranca.model;

public class Vendedor extends Funcionario{

    public double vendasSemestrais;

    public  Vendedor() {super();}

    public Vendedor(double vendasSemestrais) {
        this.vendasSemestrais = vendasSemestrais;
    }

    public Vendedor(String nomes, String cpf, Enderecos enderecos, double salarioFixo, double vendasSemestrais) {
        super(nomes, cpf, enderecos, salarioFixo);
        this.vendasSemestrais = vendasSemestrais;
    }

    public double getVendasSemestrais() {
        return vendasSemestrais;
    }

    public void setVendasSemestrais(double vendasSemestrais) {
        this.vendasSemestrais = vendasSemestrais;
    }

    @Override
    public double getBonus() {return this.getVendasSemestrais() * 0.015;}

    @Override
    public String getDetalhamento(){
        return "Nome: " + this.getNomes() +
                "\nEndereço: " + this.getEnderecos().getEnderecoCompleto() +
                "\nSalário Mensal: " + this.getSalarioFixo() +
                "\nVendas no Semestre: R$" + this.getVendasSemestrais() +
                "\nBônus Semestral: R$" + this.getBonus();

    }
}
