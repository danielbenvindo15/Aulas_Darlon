import java.util.Scanner;

public class Crescente {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor;

        System.out.println(mensagem);
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int v1 = lerInteiro("Digite um valor:");
        int v2 = lerInteiro("Digite o segundo valor:");

        if (v1 <= v2) {
            while (v1 <= v2) {
                System.out.println("número: " + v1);
                v1 ++;
            }
        }else{
            while (v2 <= v1) {
                System.out.println("número: " + v2);
                v2 ++;
            }
        }
    }
}
