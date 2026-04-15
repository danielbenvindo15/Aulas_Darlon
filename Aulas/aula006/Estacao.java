import java.util.Scanner;

public class Estacao {
    public static Scanner entrada = new Scanner(System.in);

    //Entrada de Dados
    public static int numeroMes() {
        int numero;

        System.out.println("Digite o número do seu mês:");
        numero = entrada.nextInt();

        return numero;
    }

    public static void main(String[] args) {
        //Variáveis
        int mes = numeroMes();

        //Processamento e saída
        if (mes < 1 || mes > 12) {
            System.out.println("Digite um mês válido.");
        }
        else if (mes <= 2 || mes == 12) {
            System.out.println("A estação atual é Verão.");
        }
        else if (mes >= 3 && mes <= 5) {
            System.out.println("A estação atual é Outono.");
        }
        else if (mes >= 6 && mes <= 8) {
            System.out.println("A estação atual é Inverno.");
        }
        else {
            System.out.println("A estação atual é Primavéra.");
        }
    }
}
