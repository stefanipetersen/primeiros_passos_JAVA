import java.util.Scanner;

public class UsandoScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double x = sc.nextDouble();

        System.out.println("Digite o segundo valor");
        double y = sc.nextDouble();

        double soma = x + y;

        double subtracao = x - y;

        double multiplicacao = x * y;

        double divisao = x / y;

        System.out.println("Soma: " + soma + " Subtração: " + subtracao + " Multiplicação: " + multiplicacao + " Divisão: " + divisao);

        sc.close();

    }
}
