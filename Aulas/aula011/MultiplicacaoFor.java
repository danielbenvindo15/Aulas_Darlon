import java.util.Scanner;

public class MultiplicacaoFor {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um valor");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int numero = lerInteiro();
        int i;
        int resultado;

        for (i = 1; i <= 20; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
