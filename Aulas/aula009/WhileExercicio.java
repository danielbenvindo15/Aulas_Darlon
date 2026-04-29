import java.util.Scanner;

public class WhileExercicio {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um valor");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int i = 1;
        int valor_final = lerInteiro();

        while (i <= valor_final) {
            System.out.println("número: " + i);
            i ++;
        }
    }
}
