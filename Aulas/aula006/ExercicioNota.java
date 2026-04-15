import java.util.Scanner;

public class ExercicioNota {
    public static Scanner entrada = new Scanner(System.in);

    public static float nota() {
        float grade;

        System.out.println("Digite sua nota:");
        grade = entrada.nextFloat();

        return grade;
    }

    public static void main(String[] args) {
        //variáveis
        float notaAluno;

        notaAluno = nota();

        if (notaAluno >= 9) {
            System.out.println("Conceito A, aprovado.");
        }
        else if (notaAluno >= 7.5) {
            System.out.println("Conceito B, aprovado.");
        }
        else if (notaAluno >= 6) {
            System.out.println("Conceito C, aprovado.");
        }
        else {
            System.out.println("Conceito D, reprovado.");
        }



    }
    
}