import java.util.Scanner;

public class Exercicio07 {
    public static Scanner entrada = new Scanner(System.in);

    public static String lerString(String mensagem) {
        String msg;

        System.out.println(mensagem);
        msg = entrada.nextLine();


        return msg;
    }

    public static void main(String[] args) {
        int sim = 0;
        String resposta;

        //Processamento
        resposta = lerString("Telefonou para a vítima? (s para sim e qualquer tecla para não.)");
        if (resposta.equals("s")) {
            sim += 1;
        }

        resposta = lerString("Esteve no local do crime?");
        if (resposta.equals("s")) {
            sim += 1;
        }

        resposta = lerString("Mora perto da vítima?");
        if (resposta.equals("s")) {
            sim += 1;
        }

        resposta = lerString("Devia para a vítima?");
        if (resposta.equals("s") ) {
            sim += 1;
        }

        resposta = lerString("Já trabalhou com a vítima?");
        if (resposta.equals("s")) {
            sim += 1;
        }

        //Verificação de sim
        if (sim <= 1) {
            System.out.println("Inocente.");
        }
        else if (sim <= 2) {
            System.out.println("Suspeita.");
        }
        else if (sim <= 4) {
            System.out.println("Cúmplice.");
        }
        else {
            System.out.println("Assassino.");
        }
    }
}
