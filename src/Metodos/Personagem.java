package Metodos;

public class Personagem {

    private String nome;
    private int nivelEnergia;
    private String poderMagico;

    private HabilidadeEspecial habilidadeEspecial;

    public Personagem(String nome, int nivelEnergia, String poderMagico) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    public Personagem(String nome) {
        this.nome = nome;
    }

    public Personagem() {
    }

    public void atacar(String ataque) {
        if (nivelEnergia >= 10) {
            System.out.println(nome + " Realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        } else {
            System.out.println(nome + " está sem energia para atacar!");
        }
    }

    public int aumentarEnergia(int energia) {
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if (!habilidadeEspecial.getHabilitada()) {
            System.out.println("Habilidade especial não está ativada");
        } else if (nivelEnergia >= habilidadeEspecial.getCustoEnergia()) {
            System.out.println("Ativando a habilidade: " + habilidadeEspecial.getNome());
            nivelEnergia -= habilidadeEspecial.getCustoEnergia();
        } else {
            System.out.println(nome + " está sem energia para a habilidade especial");
        }
    }

    public String getNome() {
        return nome;
    }

    public Personagem setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public Personagem setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
        return this;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public Personagem setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
        return this;
    }

    public HabilidadeEspecial getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public Personagem setHabilidadeEspecial(HabilidadeEspecial habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
        return this;
    }
}
