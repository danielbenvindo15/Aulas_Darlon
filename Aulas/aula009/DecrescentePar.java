import java.util.Scanner;

public class DecrescentePar {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor;

        System.out.println(mensagem);
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int i = lerInteiro("Digite algum número:");

        while (i >= 0) {
            if (i % 2 == 0) {
                System.out.println(i + " é par.");
            }else{
                System.out.println(i + " é impar.");
            }

            i -- ;
        }
    }
}
