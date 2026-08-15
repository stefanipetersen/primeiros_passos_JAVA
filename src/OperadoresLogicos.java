import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args){

        //main1(args);
        //main2(args);
        //main3(args);
        //main4(args);
        main5(args);

    }

    //Exercício 1 - Estruturas Condicionais:
    //IF e ELSE entram agora para criar as condições para determinada(s) variável(eis).

    public static void main1(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idade;

        //Solicitação da idade ao usuário
        System.out.print("Exercício 1 \nDigite sua idade: ");
        idade = scanner.nextInt();

        //Verificação da idade para determinar o acesso ao usuário
        if (idade >= 18){
            System.out.println("Acesso concedido!");
        }
        else {
            System.out.println("Acesso negado!");
        }
    }

    //Exercício 2 - Estruturas Condicionais com Operadores Lógicos:
    // && para AND
    // || para OR
    // ! para NOT

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ensolarado, finalDeSemana;

        //Receber informações do usuário sobre as condições do tempo
        System.out.print("Exercício 2 \nEstá ensolarado? (true para sim / false para nao): ");
        ensolarado = scanner.nextBoolean();
        System.out.print("É final de semana? (true para sim / false para não): ");
        finalDeSemana = scanner.nextBoolean();

        //Verificar as condições para decidir o destino do passeio
        if (ensolarado && finalDeSemana) {
            System.out.println("Está em condições perfeitas para ir a praia!");
        }
        else {
            System.out.println("Com essas condições é melhor ir a um restaurante!");
        }
    }

    //Exercício 3 - Estruturas Condicionais com IF/ELSE encadeados:

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorCompras;
        int frequencia;

        //Solicitação de informações ao cliente
        System.out.print("Exercício 3 \nInforme o valor total de suas compras neste ano: ");
        valorCompras = scanner.nextDouble();
        System.out.print("Quantas vezes você realizou compras na loja neste ano? ");
        frequencia = scanner.nextInt();

        //Verificação de premiação dos clientes
        if (valorCompras >= 2000.0 && frequencia >= 10) {
            System.out.println("Parabéns! Você está na categoria VIP e ganhou o voucher de desconto!");
        } else if (valorCompras >= 1000.0) {
            System.out.println("Você está na categoria Ouro e ganhou pontos extras no programa de fidelidade!");
        } else if (valorCompras >= 500.0 || frequencia >= 5) {
            System.out.println("Voc" +
                    "Você está na categoria Prata e ganhou um brinde especial!");
        } else {
            System.out.println("Você está na categoria Bronze e não recebeu uma premiação especial.");
        }
    }


    //Exercício 4 - Switch Case entra como a condição de escolha, como forma de lista:

    public static void main4(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercício 4 \nBem-vindo à Caculadora! \nPor favor, escolha a operação: ");
        System.out.println("1 - SOMA \n2 - SUBTRAÇÃO \n3 - MULTIPLICAÇÃO \n4 - DIVISÃO");
        int escolha = scanner.nextInt();

        //Validação da operação escolhida
        if (escolha < 1 || escolha > 4){
            System.out.println("Operação inválida escolhida!");
            return;
        }

        System.out.println("Digite dois números: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double resultado = 0;

        switch (escolha){
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;

            case 4:
                if (num2 != 0){
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Uma divisão por zero sempre será zero");
                }
                break;

            default:
                System.out.println("Operação inválida!");

        }
    }

    //Exercício 5 - Mais um exemplo de switch case utilizando uma cafeteria:

    public static void main5(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercício 5 \nBem-vindo ao Café com Java!");
        System.out.println("Escolha o tamanho do seu café: (P) Pequeno, (M) Médio ou (G) Grande: ");
        String tamanho = scanner.nextLine().toUpperCase();

        if (!tamanho.equalsIgnoreCase("P") &&
                !tamanho.equalsIgnoreCase("M") &&
                !tamanho.equalsIgnoreCase("G")) {

            System.out.println("Tamanho inválido!");
            return;
        }

        System.out.println("Escolha o tipo de café: (E) Expresso, (C) Cappuccino ou (L) Latte");
        String tipoCafe = scanner.nextLine().toUpperCase();

        if (!tipoCafe.equalsIgnoreCase("E") &&
                !tipoCafe.equalsIgnoreCase("C") &&
                !tipoCafe.equalsIgnoreCase("L")) {

            System.out.println("Tipo de café inválido!");
            return;
        }

        double preco = 0;
        switch (tamanho){
            case "P":
                preco += 2.50;
                break;
            case "M":
                preco += 3.00;
                break;
            case "G":
                preco += 3.50;
                break;

        }
        switch (tipoCafe){
            case "E":
                preco += 1.50;
                System.out.println("Café expresso selecionado.");
                break;
            case "C":
                preco += 2.00;
                System.out.println("Cappuccino selecionado.");
                break;
            case "L":
                preco += 2.50;
                System.out.println("Café latte selecionado.");
                break;

        }
        System.out.println("Seu pedido foi confirmado com sucesso \nTotal a pagar: R$" + preco);
    }

}
