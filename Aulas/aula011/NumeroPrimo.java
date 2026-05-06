import java.util.Scanner;

public class NumeroPrimo {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um valor");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int i;
        int numero = lerInteiro();
        int divisor = 1;
        
        if (numero == 0 || numero % 2 != 0) {
            System.out.println("Número inválido. Digite um número par ou maior que 0.");
        }else{
            for (i = 1; i <= numero; i++){
                if (i % numero == 0) {
                    divisor *= i;
                }
            }

            if (divisor == numero) {
                System.out.println("é primo");
            }
            else {
                System.out.println("não é primo");
            }
        }
        
    }
}
