import java.util.Scanner;

public class OperadoresSwitchCase {
    public static Scanner entrada = new Scanner(System.in);

    public static char lerCaractere() {
        char operador;

        System.out.println("Qual o seu operador?");
        operador = entrada.next().charAt(0);

        return operador;
    }

    public static int lerInteiro(String mensagem) {
        int valor;

        System.out.println(mensagem);
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        //Variáveis
        int n1 = lerInteiro("Qual o primeiro valor?");
        char OP = lerCaractere();
        int n2 = lerInteiro("Qual o segundo valor?");

        //Processamento
        switch (OP) {
            case '+' :
                System.out.println(n1 + n2);
            
                break;
            
            case '-' :
                System.out.println(n1 - n2);

                break;
            
            case '/' :
                System.out.println(n1 / n2);
                break;

            case '*' :
                System.out.println(n1 * n2);
                break;

            default:
                System.out.println("Digite um operador válido.");
                System.out.println("Operadores válidos: [ + , - , / , * ]");
        }
        
    }
}
