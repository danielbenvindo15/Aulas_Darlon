import java.util.Scanner;

public class SomaPares {
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
        int somaPares = 0;
        

        for (i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            }
        }

        System.out.println(somaPares);
    }
}