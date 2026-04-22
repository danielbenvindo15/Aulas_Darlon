import java.util.Scanner;

public class Exercicio05 {
    public static Scanner entrada = new Scanner(System.in);

    //Entrada de dados
    public static int lerInteiro(String mensagem) {
        int valor;

        System.out.println(mensagem);
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        //Variáveis
        int n1 = lerInteiro("Digite um número:");
        int n2 = lerInteiro("Digite outro número:");
        int n3 = lerInteiro("Digite o útlimo número:");
        int maior;
        int menor;
        int medio = 0;
        

        //Processamento
        if (n1 == n2 || n2 == n3 || n1 == n3) {
            System.out.println("Coloque numeros diferentes.");
        }
        else {
                 //Ver maior
                if (n1 > n2 && n1 > n3) {
                    maior = n1;
                }
                else if (n2 > n1 && n2 > n3) {
                    maior = n2;
                }
                else {
                    maior = n3;
                }

                //Ver menor
                if (n1 < n2 && n1 < n3) {
                    menor = n1;
                }
                else if (n2 < n1 && n2 < n3) {
                    menor = n2;
                }
                else {
                    menor = n3;
                }

                //Ver médio
                medio = n1 + n2 + n3 - (maior + menor);

            //Saida de dados
            System.out.println(menor + " , " + medio + " , " + maior);
        }
    }
}
