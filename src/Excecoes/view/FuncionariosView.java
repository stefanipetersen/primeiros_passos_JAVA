package src.Excecoes.view;

import src.Excecoes.exception.PercentualInvalidoException;
import src.Excecoes.model.Funcionarios;

import java.util.Scanner;

public class FuncionariosView {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Funcionarios fun = new Funcionarios("Thiago", 1000);

        try {
            System.out.println("Qual percentual para o aumento de salário?");
            int p = sc.nextInt();
            fun.aumentarSalario(p);
            System.out.println("Novo salário: " + fun.getSalario());
        }
        catch (PercentualInvalidoException e){
            System.err.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
