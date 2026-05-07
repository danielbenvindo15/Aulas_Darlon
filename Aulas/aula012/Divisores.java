import java.util.Scanner;

public class Divisores {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Variável
        int i;
        int n;
        int divisores = 0;

        //Entrada de Dados
        System.out.println("Digite um número:");
        n = entrada.nextInt();

        //Processamento
        for (i = 1; i < n; i++){
            if (n % i == 0){
                divisores += i;
            }
        }

        //Saída de Dados
        if (divisores == n) {
            System.out.println("Numero perfeito");
        }else{
            System.out.println("Numero não perfeito");
        }
    }
}
