import java.util.Scanner;

public class MaiorMenor {
    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        //variáveis
        int n1;
        int n2;
        int n3;
        int maior;
        int menor;

        //entrada de dados
        System.out.println("Digite o primeiro número");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo valor:");
        n2 = entrada.nextInt();

        System.out.println("Digite o último valor:");
        n3 = entrada.nextInt();

        //definindo maior
        if (n1 > n2 && n1 > n3) {
            maior = n1;
        }
        else if (n2 > n1 && n2 > n3) {
            maior = n2;
        }
        else {
            maior = n3;
        }

        //definindo menor
        if (n1 < n2 && n1 < n3){
            menor = n1;
        }
        else if (n2 < n1 && n2 < n3) {
            menor = n2;
        }
        else {
            menor = n3;
        }

        //Saída
        if (n1 == n2 || n2 == n3 || n1 == n3) {
            System.out.println("Coloque numeros diferentes.");
        }
        else {
            System.out.println("O maior número é " + maior + " e o menor número é " + menor);
        }
        }

        
}
