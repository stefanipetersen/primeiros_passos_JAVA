package AulaMetodos;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public Produto() {
    }

    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + nome + " Preço do produto: " + preco + " Quantidade no estoque: " + quantidade);
    }

    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada <= quantidade) {
            quantidade -= quantidadeComprada;
            System.out.println("Compra realizada com sucesso! Quantidade restante: " + quantidade);
        } else {
            System.out.println("Quantidade insuficiente em estoque");
        }

    }

    public void adicionarEstoque(int quantidadeAdicional) {
        quantidade += quantidadeAdicional;
        System.out.println("Quantidade adicionada com sucesso! Quantidade atual: " + quantidade);
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
        System.out.println("Desconto aplicado! Novo preço: R$" + preco);
    }


}
