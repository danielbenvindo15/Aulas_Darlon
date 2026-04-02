package Aulas.aula003;
import java.util.Scanner;

public class ValorDecimal {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double numero;

        numero = valordigitado();

        System.out.printf("%.2f", numero);
    }

    public static double valordigitado() {

        double valor;

        System.out.println("Digite um valor");
        valor = entrada.nextDouble();

        return valor;
    }
    
}
