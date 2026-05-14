package aula014;
import java.util.Scanner;

public class ImprimirTriangulo {
    public static Scanner entrada = new Scanner(System.in);
    
    public static int lerInteiro() {
        int num;

        System.out.println("Digite um número");
        num = entrada.nextInt();

        return num;
    }

    public static void main(String[] args) {
        //Variáveis
        int asterisco = 1;
        int quantidade = lerInteiro();
        int hifem = 4;
        int i, j;

        //Processamento e Saída de Dados
        if (quantidade % 2 != 0) {
            for (i = 0; i < 5; i++) {
            
                for (j = hifem; j > 0; j--) {
                    System.out.print("_");
                }

                for (j = asterisco; j > 0; j--) {
                    System.out.print("*");
                }

                for (j = hifem; j > 0; j--) {
                    System.out.print("_");
                }

            asterisco += 2;
            hifem--;
            System.out.println();
            }
            
        }else{
            System.out.println("é par.");
        }
        
    }
}
