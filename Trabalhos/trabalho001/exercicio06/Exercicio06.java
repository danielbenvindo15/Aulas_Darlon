import java.util.Scanner;

public class Exercicio06 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Variáveis
        int ano;

        //Entrada de dados
        System.out.println("Digite um ano:");
        ano = entrada.nextInt();

        //Processamento e saída de dados
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("É bissexto.");
        }
        else {
            System.out.println("Não é bissexto.");
        }
    }
}
