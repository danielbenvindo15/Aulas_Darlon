import java.util.Scanner;

public class Votação {
    public static Scanner entrada = new Scanner(System.in);
    
    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um número válido (1 ou 2)");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int candidatoA = 0;
        int i;
        int candidatoB = 0;
        int voto = 0;

        for (i = 0; i < 10; i++){
            voto = lerInteiro();

            switch (voto) {
                case 1:
                    candidatoA++;
                    break;
                
                case 2:
                    candidatoB++;
                    break;
            
                default:
                    i--;
                    break;
            }
        }

        if (candidatoA > candidatoB) {
            System.out.println("Candidato A ganhou");
        }else if (candidatoB > candidatoA) {
            System.out.println("Candidato B ganhou");
        }else{
            System.out.println("Empate");
        }
    }
}
