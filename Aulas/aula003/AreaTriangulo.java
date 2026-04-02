package Aulas.aula003;
import java.util.Scanner;

public class AreaTriangulo {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        float area = 0;

        System.out.println("Qual a altura do triângulo?");
        float altura = entrada.nextFloat();

        System.out.println("Qual o tamanho da base?");
        float base = entrada.nextFloat();

        entrada.close();

        area = base * altura / 2 ;

        System.out.println("A área do triângulo é de: " + area);


    }
    
}
