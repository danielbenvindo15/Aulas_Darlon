import java.util.Scanner;

public class Divisores {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um número");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int i;
        int numero = lerInteiro();


        for (i = 1; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}
