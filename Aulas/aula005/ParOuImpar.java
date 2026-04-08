import java.util.Scanner;

public class ParOuImpar {

    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {

        int numero;

        System.out.println("Digite um número");
        numero = entrada.nextInt();

        return numero;
    }

    public static void main(String[] args) {
        
        int valor;

        valor = lerInteiro();

        if(valor % 2 == 0){
            System.out.println("Número par.");
        }
        else{
            System.out.println("Número ímpar");
        }
    }
}
