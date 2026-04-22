import java.util.Scanner;

public class Exercicio04 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Variáveis
        int dinheiro;
        int valor;
        int notas100 = 0;
        int notas50 = 0;
        int notas10 = 0;
        int notas5 = 0;

        System.out.println("Quanto dinheiro você quer sacar?");
        dinheiro = entrada.nextInt();

        //Processamento
        valor = dinheiro;

        notas100 = dinheiro / 100;
        dinheiro -= (notas100 * 100);

        notas50 = dinheiro / 50;
        dinheiro -= (notas50 * 50);

        notas10 = dinheiro / 10;
        dinheiro -= (notas10 * 10);

        notas5 = dinheiro / 5;
        dinheiro -= (notas5 * 5);
        
        if (valor < 1 || valor > 600) {
            System.out.println("Não pode sacar");
        }
        else {
            if (notas100 >= 1) {
                if (notas100 == 1) {
                    System.out.println(notas100 + " nota de 100.");
                }
                else {
                    System.out.println(notas100 + " notas de 100.");
                }
            }
            if (notas50 >= 1) {
                if (notas50 == 1) {
                    System.out.println(notas50 + " nota de 50.");
                }
                else {
                    System.out.println(notas50 + " notas de 50.");
                }
            }
            if (notas10 >= 1) {
                if (notas10 == 1) {
                    System.out.println(notas10 + " nota de 10.");
                }
                else {
                    System.out.println(notas10 + " notas de 10.");
                }
            }
            if (notas5 >= 1) {
                if (notas5 == 1) {
                    System.out.println(notas5 + " nota de 5.");
                }
                else {
                    System.out.println(notas5 + " notas de 5.");
                }
            }
            if (dinheiro >= 1) {
                if (dinheiro == 1) {
                    System.out.println(dinheiro + " nota de 1.");
                }
                else {
                    System.out.println(dinheiro + " notas de 1.");
                }
            }
        }

        
    }
}
