package Modificadores;

public class Cliente {

    //Modificadores de acesso
    //private: pode ser acessado somente pela própria classe
    //public: pode ser acessado por qualquer outra classe
    //default (sem modificador): pode ser acessado por qualquer classe que esteja no mesmo pacote
    //protected: pode ser acessado por qualquer classe do mesmo pacote da classe ou por qualquer classe que herde da classe

    protected String nome;
    protected String cpf;
    protected boolean ativo;

    public void exibirDados() {
        System.out.println(nome + " " + cpf + " " + formatarDado());
    }

    //Como esse metodo so preciso que o exibir dados use ele, entao vamos deixar ele privado para outras classes n terem acesso a ele
    private String formatarDado(){
        if (ativo)
            return "Ativo";
        else
            return "Inativo";
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //atalho para colocar os getters e setters para todos os atributos: Alt + Insert -> Getter and Setter -> seleciona os atributos desejados para serem atribuidos.


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
