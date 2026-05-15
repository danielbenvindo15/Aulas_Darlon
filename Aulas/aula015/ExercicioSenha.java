package aula015;
import java.util.Scanner;

public class ExercicioSenha {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int n;

        System.out.println("Digite a senha:");
        n = entrada.nextInt();

        return n;
    }

    public static void main(String[] args) {
        int i;

        do {
            i = lerInteiro();
            switch (i) {
                case 2002:
                    System.out.println("Acesso Permitido");
                    break;
            
                default:
                    System.out.println("Senha Inválida");
                    break;
            }
        } while (i != 2002);
    }
}
