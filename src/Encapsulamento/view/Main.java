package src.Encapsulamento.view;
import src.Encapsulamento.model.Aluno;
import src.Encapsulamento.model.Cidade;
import src.Encapsulamento.model.Endereco;
import Modificadores.Cliente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Chamada da Package Modificadores
        Cliente cliente = new Cliente();

        //Como o nome está como protected e colocamos o getter e o setter, basta chamar o .set ou .get do nome
        cliente.setNome("Thiago");
        cliente.setCpf("55226854965");
        cliente.exibirDados();
        System.out.println(cliente.getNome());

        //Desafio do Encapsulamento
        Scanner sc = new Scanner(System.in);
        int op;
        Aluno aluno = new Aluno();

        do {
            System.out.println("Escolha: \n1-Cadastrar Aluno \n2-Exibir Aluno \n0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Qual o nome do aluno");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Qual o RM");
                    int rm = sc.nextInt();
                    System.out.println("Qual o longradouro do aluno");
                    String longradouro = sc.next() + sc.nextLine();
                    System.out.println("Qual o numero");
                    String numero = sc.next() + sc.nextLine();
                    System.out.println("Qual o CEP");
                    String cep = sc.next() + sc.nextLine();
                    System.out.println("Qual o nome da cidade");
                    String nomeCidade = sc.next() + sc.nextLine();
                    System.out.println("Qual o estado");
                    String estado = sc.next() + sc.nextLine();
                    Cidade cidade = new Cidade(nomeCidade, estado);
                    Endereco endereco = new Endereco(longradouro, numero, cep, cidade);
                    aluno.setNome(nome);
                    aluno.setRm(rm);
                    aluno.setEndereco(endereco);
                    System.out.println("Aluno Registrado!");
                    break;

                case 2:
                    System.out.println(aluno.getNome() + ", rm: " + aluno.getRm());
                    System.out.println(aluno.getEndereco().getLogradouro() + ", " + aluno.getEndereco().getNumero() + ", CEP: " + aluno.getEndereco().getCep());
                    System.out.println(aluno.getEndereco().getCidade().getNome() + "/" + aluno.getEndereco().getCidade().getEstado());
                    break;

                case 0:
                    System.out.println("Finalizando o sistema");
                    break;
                default:
                    System.out.println("Opção Inválida!");



            }
        } while (op != 0);

        sc.close();

    }


}