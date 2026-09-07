package src.Heranca.model;

public class Programador extends Funcionario{

    public int ramal;

    public Programador(){super();}

    public Programador(String nomes, String cpf, Enderecos enderecos, double salarioFixo, int ramal) {
        super(nomes, cpf, enderecos, salarioFixo);
        this.ramal = ramal;
    }

    public int getRamal() {return ramal;}

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    @Override
    public double getBonus(){return this.getSalarioFixo() * 0.02;}

    @Override
    public String getDetalhamento(){
        return "Nome: " + this.getNomes() +
                "\nRamal: " + this.getRamal() +
                "\nEndereço: " + this.getEnderecos().getEnderecoCompleto() +
                "\nSalario Mensal: " + this.getSalarioFixo() +
                "\nBônus Semestral: " + this.getBonus();
    }
}
