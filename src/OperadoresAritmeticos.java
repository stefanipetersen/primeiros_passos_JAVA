public class OperadoresAritmeticos {

    public static void main(String[] args) {

        //São eles: +, -, *, /, %, ++, --

        int x = 10;
        int y = 5;

        int soma = x + y;
        System.out.println("Soma: " + soma);

        int multiplicacao = x * y;
        System.out.println("Vezes: " + multiplicacao);

        float f = 5;
        System.out.println(f / 2);

        int resto = y % 2;
        System.out.println("Resto da Divisão: " + resto);

        x++;
        System.out.println("Adicionando 1 do x: " + x);

        y--;
        System.out.println("Diminuindo 1 do y: " + y);



    }
}
