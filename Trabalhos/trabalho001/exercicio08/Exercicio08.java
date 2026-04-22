import java.util.Scanner;

public class Exercicio08 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Variáveis
        int lados;
        float medida;
        float area = 0;

        //Entrada de dados
        System.out.println("Quantos lados o seu polígono tem?");
        lados = entrada.nextInt();

        System.out.println("Qual a medida do lado?");
        medida = entrada.nextFloat();

        //Processamento e saída de dados
        if (lados < 3) {
            System.out.println("Não é um polígono.");
        }
        else if (lados > 5) {
            System.out.println("Polígono não identificado.");
        }
        else {
            if (lados == 3) {
                area = (float) Math.sqrt(3) / 4 * (medida * medida);
                System.out.printf("Triângulo. Área: %.2f", area);
            }
            else if (lados == 4) {
                area = medida * medida;
                System.out.printf("Quadrado. Área: %.2f", area);
            }
            else {
                System.out.println("Pentágono.");
            }
        }
    }
}
