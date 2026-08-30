package Encapsulamento.model;

public class Cidade {

    private String nome;
    private  String estado;

    //Para criar os contrutores, basta selecionar o atalho:
    //Alt + Insert -> Constructor -> selecionar os atributos desejados;
    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    //Para criar o construtor da package, basta selecionar o atalho:
    //Alt + Insert -> Constructor -> selecionar a package;
    public Cidade() {
    }

    //Para criar os getters e setter dos atributos, basta selecionar o atalho:
    //Alt + Insert -> Getter and Setter -> selecionar os atributos desejados;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
