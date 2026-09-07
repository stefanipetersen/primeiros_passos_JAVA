package src.Metodos;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        int op;

        do {
            System.out.println("Bem-vindo(a) ao Supermercado! \nO que deseja fazer hoje? " +
                    "\n1-Exibir produto \n2-Comprar um produto \n3-Adicionar um produto ao estoque \n4-Cadastrar produto \n5-Aplicar desconto \n0-Sair");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    produto.exibirInformacoes();
                    break;

                case 2:
                    System.out.println("Qual a quantidade da compra?");
                    int qtd = scanner.nextInt();
                    produto.comprar(qtd);
                    break;

                case 3:
                    System.out.println("Qual a quantidade para adicionar ao estoque?");
                    qtd = scanner.nextInt();
                    produto.adicionarEstoque(qtd);
                    break;

                case 4:
                    System.out.println("Qual o nome do produto?");
                    String nome = scanner.next() + scanner.nextLine();
                    System.out.println("Qual o preco do produto?");
                    double preco = scanner.nextDouble();
                    System.out.println("Qual a quantidade do produto?");
                    int quantidade = scanner.nextInt();
                    produto = new Produto(nome, preco, quantidade);
                    break;

                case 5:
                    System.out.println("Qual o percentual de desconto?");
                    double desconto = scanner.nextDouble();
                    produto.aplicarDesconto(desconto);
                    break;

                case 0:
                    System.out.println("Finalizando o programa");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }

        } while (op != 0);
        scanner.close();

    }
}
