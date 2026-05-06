import java.util.Scanner;

public class QuadradoFor {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um valor");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int i;
        int numero = lerInteiro();

        for (i = 1; i <= numero; i++) {
            System.out.println(i + " ^ 2 = " + i * i);
        }
    }
}
