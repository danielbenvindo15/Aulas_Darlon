package aula006;
import java.util.Scanner;

public class Operacao {
    public static Scanner entrada = new Scanner(System.in);
    
    public static int lerInteiro (String mensagem) {
        int numero;

        System.out.print(mensagem);
        numero = entrada.nextInt();

        return numero;
    }

    public static String lerOperador (String mensagem) {
        String OP;

        System.out.print(mensagem);
        OP = entrada.next();

        return OP;
    }

    public static void main(String[] args) {
        int n1;
        int n2;
        int resultado;
        String operador;

        //OBS: atribuir numero a variavel sempre que for utilizar ela em algum calculo.
        resultado = 0;

        n1 = lerInteiro("Valor 1: ");
        n2 = lerInteiro("Valor 2: ");
        operador = lerOperador("Digite seu Operador: ");

        if (operador == "+") {
            resultado = n1 + n2;
            
        }
        else if (operador == "-") {
            resultado = n1 - n2;
        }
        else if (operador == "/") {
            resultado = n1 / n2;
        }
        else if (operador == "*") {
            resultado = n1 * n2;
        }
        else {
            operador = "Operador não valido";
        }

        if (operador == "Operador não valido") {
            System.out.println(operador + ".");
            System.out.println("Os operadores válidos são:  + | - | / | * ");
        }
        else {
            System.out.println(resultado);
        }
    }
}
