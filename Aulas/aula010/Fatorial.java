import java.util.Scanner;

public class Fatorial {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um número");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int valor = lerInteiro();
        int i = valor - 1;
        int fatorial = valor;
        

        
        while (i >= 1) {
            fatorial *= i;
            
            i--;

        }

        System.out.println(fatorial);
    }
}
