package src.Metodos;

public class HabilidadeEspecial {

    private String nome;
    private int custoEnergia;
    private boolean habilitada;

    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilitada){
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }

    public void ativarHabilidade(){
        habilitada = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCustoEnergia() {
        return custoEnergia;
    }

    public void setCustoEnergia(int custoEnergia) {
        this.custoEnergia = custoEnergia;
    }

    public boolean getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }
}
