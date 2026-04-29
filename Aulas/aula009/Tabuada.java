import java.util.Scanner;

public class Tabuada {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        int valor;

        System.out.println(mensagem);
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int i = lerInteiro("Digite algum número:");
        int multiplicador = 0; //inicialização da variável multiplicador
        int resultado = 0;

        //condição
        while (multiplicador <= 20) {
            resultado = i * multiplicador;

            System.out.println(i + " x " + multiplicador + " = " + resultado);

            multiplicador ++ ; //atualização
        }
    }
}
