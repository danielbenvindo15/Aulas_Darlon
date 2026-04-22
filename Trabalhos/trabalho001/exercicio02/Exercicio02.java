import java.util.Scanner;

public class Exercicio02 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        float celsius;
        float fahrenheit;

        System.out.println("Digite a temperatura em Celsius:");
        celsius = entrada.nextFloat();

        fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Isso são " + fahrenheit + " graus fahrenheit.");
    }
}