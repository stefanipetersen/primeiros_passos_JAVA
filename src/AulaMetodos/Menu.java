package AulaMetodos;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personagem personagem = new Personagem();
        int op;

        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n3-Atacar \n4-Aumentar Energia \n5-Ativar Habilidade Especial \n6-Habilitar a Habilidade Especial \n0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Digite o nome do seu personagem: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder do seu personagem: ");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de energia do seu personagem: ");
                    int energia = sc.nextInt();
                    personagem.nome = nome;
                    personagem.nivelEnergia = energia;
                    personagem.poderMagico = poder;

                    System.out.println("Digite o nome da habilidade especial do seu personagem: ");
                    String nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a habilidade especial: ");
                    int nivelEnergia = sc.nextInt();
                    System.out.println("A habilidade está ativada? (true/false): ");
                    boolean ativada = sc.nextBoolean();

                    //Criando o objeto que representa a habilidade especial com os valores informados pelo usuário
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);

                    //Atribuindo o objeto habilidade especial ao personagem
                    personagem.habilidadeEspecial = habilidadeEspecial;
                    break;

                case 2:
                    System.out.println("Nome: " + personagem.nome + " Poder: " + personagem.poderMagico + " Nível energia: " + personagem.nivelEnergia);
                    System.out.println("Habilidade: " + personagem.habilidadeEspecial.nome + " Custo energia: " + personagem.habilidadeEspecial.custoEnergia);
                    break;

                case 3:
                    System.out.println("Digite o nome do ataque: ");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;

                case 4:
                    System.out.println("Digite a quantidade de energia: ");
                    int qtd = sc.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(qtd);
                    System.out.println("Nível atual de energia: " + nivelAtual);
                    break;

                case 5:
                    personagem.ativarHabilidadeEspecial();
                    break;

                case 6:
                    personagem.habilidadeEspecial.ativarHabilidade();
                    break;

                case 0:
                    System.out.println("Finalizando o programa");
                    break;

                default:
                    System.out.println("Opção inválida");

            }
        } while (op != 0);
        sc.close();

    }
}
