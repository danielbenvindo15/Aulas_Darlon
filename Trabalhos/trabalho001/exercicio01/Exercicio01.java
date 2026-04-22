import java.util.Scanner;

public class Exercicio01 {

    public static Scanner entrada = new Scanner(System.in);

    //Entrada de dados
    public static int lerInteiro(String mensagem) {
        int valor;

        System.out.println(mensagem);
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        //Variaveis
        int y1 = 0;
        int y2 = 0;
        int x1 = lerInteiro("Digite o valor de x1:");
        int x2 = lerInteiro("Digite o  valor de x2:");
        int a = lerInteiro("Digite o valor de a:");
        int b = lerInteiro("Digite o valor de b:");
        int c = lerInteiro("Digite o valor de c:");
        int d = lerInteiro("Digite o valor de d:");

        //Processamento
        y1 = (a * x1) + (b * x2);
        y2 = (c * x1) + (d * x2);

        //Saida de dados
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
    }
}