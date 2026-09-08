package src.Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        double notas[] = new double[3];
        double somaNotas=0;
        int posicao=0;
        Scanner leitor = new Scanner(System.in);

        //O try é o bloco do código que vc deseja monitorar para possíveis exceções. O código dentro do bloco try é executado normalmente até que uma exceção seja lançada.

        try {
            for(int i=0;i<notas.length;i++) {
                System.out.println("Digite a nota da " + (i+1) + "º avaliação:");
                notas[i] = leitor.nextDouble();
                somaNotas += notas[i];
            }
            while(posicao!=-1) {
                System.out.println("Digite o número da avaliação para ver a nota, ou -1 para seguir o programa!");
                posicao=leitor.nextInt();
                if (posicao != -1)
                    System.out.println("A nota da " + posicao + "º avaliação é "  + notas[posicao - 1]);
            }
            System.out.println("A média do aluno é " + somaNotas/notas.length);

        //O catch é um bloco que é executado se e quando uma exceção é lançada dentro do bloco try. Ele permite que vc defina um conjunto de código que reage à exceção, tratando-a de alguma forma, como registrando um erro ou tentando uma recuperação alternativa.

        }catch(InputMismatchException erro) {
            System.out.println("Foi digitado um valor inválido");

        }catch(ArrayIndexOutOfBoundsException erro) {
            System.out.println("O número da avaliação não existe.");

        //O finally é um bloco opcional, que pode ser incluído  após os blocos catch e reúne todas as instruções que serão executadas obrigatoriamente no programa. Nesse caso, o fechamneto do Scanner pode ser feito nesse bloco.
        } finally {
            leitor.close();
        }

        System.out.println("Finalizando o programa!");
    }
}