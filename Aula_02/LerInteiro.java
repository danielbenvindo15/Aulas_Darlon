//declara o scanner / importa o scanner
import java.util.Scanner;

public class LerInteiro{

    //declara o teclado como o scanner
    public static Scanner teclado = new Scanner(System.in);

    public static int lerInteiro(){
        //Variáveis
        int valor;
        
        //Entrada
        System.out.println("Digite um valor inteiro:");
        valor = teclado.nextInt();
        
        //Processamento
        return valor;
    }
    public static void main(String[] args) {
        //Variáveis
        int numero, numero_quadrado;

        //Entrada
        numero = lerInteiro();

        //Processamento
        numero_quadrado = numero * numero;

        //Saída
        System.out.println("O quadrado do número é: " + numero_quadrado);
    }
}