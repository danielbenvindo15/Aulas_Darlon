import java.util.Scanner;

public class ExercicioComissao {
    public static Scanner entrada = new Scanner(System.in);
    
    //entrada de dados
    public static float venda() {
        float valor;

        System.out.println("Digite o valor da sua venda:");
        valor = entrada.nextFloat();

        return valor;
    }

    public static void main(String[] args) {
        //variáveis
        float valorVenda = venda();
        float comissao = 0;
        
        //Processamento
        if (valorVenda <= 1000) {
            comissao = (valorVenda * 5) / 100;

        }
        else if (valorVenda <= 5000) {
            comissao = (valorVenda * 8) / 100;
        }
        else {
            comissao = (valorVenda * 12) / 100;
        }

        //Saída
        System.out.println("O valor da sua comissão é de R$: " + comissao);
    }
}
