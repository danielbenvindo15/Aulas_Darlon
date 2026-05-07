import java.util.Scanner;

public class LerInteiro {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        
        int valor_inteiro;

        //Entrada de Dados
        do{
            System.out.print("Digite um valor não negativo: ");
            valor_inteiro = entrada.nextInt();
        }while(valor_inteiro < 0);

        //Saída
        System.out.println("Número: " + valor_inteiro);
    }
}
