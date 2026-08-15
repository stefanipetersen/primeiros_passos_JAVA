import java.util.Scanner;
import java.util.Random;

public class LacosDeRepeticao {

    public static void main(String[] args){

        //main1(args); //Aprendendo usar o DO - Jogo de adivinhação
        //main2(args); //Utilizando o DO para evoluir o sistema da cafeteria (OperadoresLogicos):
        //main3(args); //Usando o DO-WHILE
        //main4(args); //Usando o DO-WHILE para evoluir o sistema da cafeteria (OperadoresLogicos):
        //main5(args); //Jogo de adivinhação com o DO-WHILE
        //main6(args); //Escrevendo números de 1 a 10 usando FOR
        //main7(args); //Lendo as notas de 10 alunos e calculando a média
        //main8(args); //Fazendo a Tabuada com o FOR
        //main9(args); //Verificando se um numero é primo
        main10(args); //Fazendo um sistema de pedidos de sorvete

    }

    //Usados para fazer um tarefa repetitiva, são estruturas que usamos para repetir o bloco de código enquanto uma condição for verdadeira
    // Temos três tipo de laços de repetição: WHILE, DO WHILE e FOR.
    //Usamos o while e do while quando não temos um valor específico para aquela repetição
    //Já o for só podemos usar quando temos um numero especifico de repetição

    //Exercício 1 - Aprendendo usar o DO - Jogo de adivinhação:

    public static void main1(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //O random gera um numero aleatorio entre 1 e 20
        int numeroSecreto = random.nextInt(20) + 1;

        System.out.println("Exercício 1 \nBem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 a 20");
        int tentativas = 0;
        boolean adivinhou = false;

        while (!adivinhou){
            System.out.println("Digite sua tentativa: ");
            int tentativa = scanner.nextInt();
            tentativas++;
            if (tentativa == numeroSecreto){
                System.out.println("Parabéns! Você acertou o número em " + tentativas);
                adivinhou = true;
            } else if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior");
            } else {
                System.out.println("Tente um número menor");
            }
        }
        scanner.close();
    }

    //Exercício 2 - Utilizando o DO para evoluir o sistema da cafeteria (OperadoresLogicos):

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercício 2 \nBem-vindo ao Café Java 2.0!");
        double valorTotal = 0;
        int quantidadeCafes = 0;
        boolean continuarPedido = true;

        while (continuarPedido) {
            System.out.println("Escolha o tamanho do seu café: (P) Pequeno, (M) Médio, (G) Grande");
            String tamanhoCafe = scanner.next().toUpperCase();

            if (tamanhoCafe.equals("F")) {
                continuarPedido = false;
            } else {
                System.out.println("Escolha o tipo de café: (E) Expresso, (C) Cappuccino, (L) Latte");
                String tipoCafe = scanner.next().toUpperCase();
                double preco = 0;
                switch (tamanhoCafe) {
                    case "P":
                        preco += 2.50;
                        break;
                    case "M":
                        preco += 3.00;
                        break;
                    case "G":
                        preco += 3.50;
                        break;
                    default:
                        System.out.println("Opção de tamanho inválida!");
                        continue;
                }
                switch (tipoCafe) {
                    case "E":
                        preco += 1.50;
                        System.out.println("Café Expresso selecionado");
                        break;
                    case "C":
                        preco += 2.00;
                        System.out.println("Café Cappuccino selecionado");
                        break;
                    case "L":
                        preco += 2.50;
                        System.out.println("Café Latte selecionado");
                        break;
                    default:
                        System.out.println("Opção de café inválida!");
                        continue;
                }
                valorTotal += preco;
                quantidadeCafes++;
                System.out.println("Café adicionado ao pedido!");
            }
        }
        System.out.println("Seu pedido foi finalizado. Total a pagar: R$" + valorTotal);
        System.out.println("Quantidade de cafés pedidos: " + quantidadeCafes);
        scanner.close();
    }

    //A maior diferença entre o DO e o DO-WHILE é q no DO-WHILE ele executa o bloco de codigo pelo menos uma vez antes de verificar a condição.

    // Exercício 3 - Usando o DO-WHILE

    public static void main3(String[] args){
        int contador = 1;
        do {
            System.out.println("Exercício 3 \nContagem: " + contador);
            contador++;
        } while (contador <= 5);
    }

    // Exercício 4 - Usando o DO-WHILE para evoluir o sistema da cafeteria (OperadoresLogicos):

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercício 4 \nBem-vindo ao Café Java 3.0!");
        double valorTotal = 0;
        int quantidadeCafes = 0;
        boolean continuarPedido = true;
        do {
            System.out.println("Escolha o tamanho do seu café: (P) Pequeno, (M) Médio, (G) Grande");
            String tamanhoCafe = scanner.next().toUpperCase();
            if (tamanhoCafe.equals("F")) {
                continuarPedido = false;
            } else {
                System.out.println("Escolha o tipo de café: (E) Espresso, (C) Cappuccino, (L) Latte");
                String tipoCafe = scanner.next().toUpperCase();
                double preco = 0;
                switch (tamanhoCafe) {
                    case "P":
                        preco += 2.50;
                        break;
                    case "M":
                        preco += 3.00;
                        break;
                    case "G":
                        preco += 3.50;
                        break;
                    default:
                        System.out.println("Opção de tamanho inválida!");
                        continue;
                }
                switch (tipoCafe) {
                    case "E":
                        preco += 1.50;
                        System.out.println("Café Espresso selecionado");
                        break;
                    case "C":
                        preco += 2.00;
                        System.out.println("Café Cappuccino selecionado");
                        break;
                    case "L":
                        preco += 2.50;
                        System.out.println("Café Latte selecionado");
                        break;
                    default:
                        System.out.println("Opção de café inválida!");
                        continue;
                }
                valorTotal += preco;
                quantidadeCafes++;
                System.out.println("Café adicionado ao pedido!");
            }
        } while (continuarPedido);
        System.out.println("Seu pedido foi finalizado. Total a pagar: R$" + valorTotal);
        System.out.println("Quantidade de cafés pedidos: " + quantidadeCafes);
        scanner.close();
    }

    // Exercício 5 - Jogo de adivinhação com o DO-WHILE

        public static void main5(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Exercício 5 \nBem-vindo ao Jogo de Adivinhação!");

            int numeroSecreto = random.nextInt(10) + 1;
            int tentativas = 0;
            int palpite;

            System.out.println("Tente adivinhar o número secreto entre 1 e 10.");
            do {
                System.out.print("Digite o seu palpite: ");
                palpite = scanner.nextInt();
                tentativas++;
                if (palpite == numeroSecreto) {
                    System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
                } else {
                    System.out.println("Tente novamente.");
                }

            } while (palpite != numeroSecreto);
            System.out.println("Você acertou em " + tentativas + " tentativas!");
            scanner.close();
        }

    // Exercício 6 -  Escrevendo números de 1 a 10 usando FOR

         public static void main6(String[] args) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

    // Exercício 7 - Lendo as notas de 10 alunos e calculando a média

        public static void main7(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalAlunos = 10;
            double somaNotas = 0;
            System.out.println("Informe as notas dos " + totalAlunos + " alunos:");
            for (int i = 1; i <= totalAlunos; i++) {
                System.out.print("Nota do aluno " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }
            double mediaSala = somaNotas / totalAlunos;
            System.out.println("\nA média das notas da sala é: " + mediaSala);
            scanner.close();
        }

    //Exercício 8 - Fazendo a Tabuada com o FOR

        public static void main8(String[] args) {
            System.out.println("Tabela de Multiplicação:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("\nTabuada do " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    int resultado = i * j;
                    System.out.println(i + " x " + j + " = " + resultado);
                }
            }
        }

    //Exercício 9 - Verificando se um numero é primo

    public static void main9(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número inteiro positivo maior que 1: ");
            int numero = scanner.nextInt();
            if(numero <= 1) {
                System.out.println("Número inválido. Digite um número inteiro positivo maior que 1.");
            } else {
                boolean ehPrimo = true;
                for(int i = 2; i < numero; i++) {
                    if(numero % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if(ehPrimo) {
                    System.out.println("O número " + numero + " é um número primo.");
                } else {
                    System.out.println("O número " + numero + " não é um número primo.");
                }
            }
            scanner.close();
        }

    //Exercício 10 - Fazendo um sistema de pedidos de sorvete

    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdSorvetes = 0;
        double valorTotal = 0;
        double valorSorvete = 0;
        boolean finalizarPedido = false;
        System.out.println("Bem-vindo à Sorveteria!");
        while (!finalizarPedido) {
            System.out.println("\nOpções de Sorvetes:");
            System.out.println("1. 1 Bola casquinha - R$6,00");
            System.out.println("2. 2 Bolas casquinha - R$9,00");
            System.out.println("3. 2 Bolas cascão recheado - R$12,00");
            System.out.print("Escolha uma opção de sorvete (ou '0' para finalizar o pedido): ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    finalizarPedido = true;
                    break;
                case 1:
                    valorSorvete = 6.00;
                    break;
                case 2:
                    valorSorvete = 9.00;
                    break;
                case 3:
                    valorSorvete = 12.00;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha um número válido.");
                    break;
            }
            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Quantas unidades deste sorvete? ");
                int qtd = scanner.nextInt();
                qtdSorvetes += qtd;
                valorTotal += valorSorvete * qtd;
                for (int i = 0; i < qtd; i++) {
                    System.out.print("Deseja cobertura 1 – Sim, 2 – Não? ");
                    int escolhaCobertura = scanner.nextInt();
                    if (escolhaCobertura == 1) {
                        System.out.println("Opções de Cobertura:");
                        System.out.println("1. Chocolate - R$2,00");
                        System.out.println("2. Morango - R$2,00");
                        System.out.println("3. Avelã - R$3,00");
                        System.out.print("Escolha uma opção de cobertura: ");
                        int opcaoCobertura = scanner.nextInt();
                        switch (opcaoCobertura) {
                            case 1:
                            case 2:
                                valorTotal += 2.00;
                                break;
                            case 3:
                                valorTotal += 3.00;
                                break;
                            default:
                                System.out.println("Opção inválida. Sem cobertura.");
                                break;
                        }
                    }
                }
            }
        }
        System.out.println("\nResumo do Pedido:");
        System.out.println("Quantidade de Sorvetes: " + qtdSorvetes);
        System.out.println("Valor Total: R$" + valorTotal);
        System.out.println("Obrigado pela preferência!");
        scanner.close();
    }

}
