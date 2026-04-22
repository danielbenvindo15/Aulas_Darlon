import java.util.Scanner;

public class Exercicio03 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Variáveis
        float distancia;
        float combustivel;
        float consumo;

        //Entrada de Dados
        System.out.println("Quantos quilometros você andou?");
        distancia = entrada.nextFloat();

        System.out.println("Quantos litros de combustível foram gastos?");
        combustivel = entrada.nextFloat();

        //Processamento
        consumo = (distancia / combustivel);
        
        //Saída de Dados
        System.out.println("Consumo: " + consumo + " Km/L");


    }
}
