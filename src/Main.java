
public class Main {

    public static void main(String[] args){

        //Em Java sempre declaramos uma variável começando pelo tipo + nome da variável.
        String cachorro;
        //E para inicializar a variável com um valor específico utilizamos o =
        cachorro = "Duque";
        //Também é possível fazer isso ao mesmo tempo.
        int anoNascimento = 2000;


        //Tipos primitivos
        //Todos os tipos primitivos de dados começam com a letra minuscula

        //byte, short, int, long - numeros inteiros, porém o byte armazena uma quantidade bem menor em relação aos outros dois tipos
        int idade;
        idade = 33;

        //float, double - numeros decimais, a diferença é q o double consegue armazenar maior numero de dados depois da virgula. Um detalhe é q o float precisa colocar o f no final do numero, se n ele gera um erro e sugere q aquele valor é double.
        float altura;
        altura = 1.65f;

        double peso;
        peso = 55.2;

        //char - apenas um caracter e quando nomear usar aspas simples.
        char genero = 'M';
        char numero = '1';

        //boolean - verdadeiro ou falso
        boolean verdadeira = true;
        boolean falsa = false;


        //Tipo de referência -
        //Já os tipos de referência de dados começam com a letra maiúscula, e é uma classe.

        //String - texto e quando for nomear usar apas duplas.
        String nome = "Stefani Petersen";


    }
}