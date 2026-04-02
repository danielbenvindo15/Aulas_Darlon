import java.util.Scanner;

public class Sucessor {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Variáveis

        int antecessor;
        int sucessor;
        int numero;

        //Entrada
        System.out.println("Digite um número inteiro:");
        numero = teclado.nextInt();

        //Processamento
        antecessor = numero - 1;
        sucessor = numero + 1;

        //Saída
        System.out.println("[" + antecessor + "," + numero + "," + sucessor + "]");

    }
    
}
