import java.util.Scanner;

public class PorExtenso {
    public static Scanner entrada = new Scanner(System.in);

    //Entrada de dados
    public static int lerInteiro() {
        int valor;

        System.out.println("Qual o valor?");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        //Variáveis
        int centena, dezena, unidade;
        int numero = lerInteiro();
        String centenaString = "";
        String dezenaString = "";
        String unidadeString = "";

        //Processamento
        centena = numero / 100;
        dezena = numero % 100 / 10;
        unidade = numero % 10;


        if (numero >= 1000) {
            System.out.println("Coloque um número de até 3 digitos.");
        }
        else {
            if (dezena == 1 && unidade >= 6) {
                unidade = 0;
            }


            switch (centena) {
                case 1:
                    if (numero == 100) {
                        centenaString = "cem";
                    }
                    else {
                        centenaString = "cento ";
                    }
                    break;
                
                case 2:
                    centenaString = "duzentos ";
                    break;
                
                case 3:
                    centenaString = "trezentos ";
                    break;

                case 4:
                    centenaString = "quatrocentos ";
                    break;

                case 5:
                    centenaString = "quinhentos ";
                    break;

                case 6:
                    centenaString = "seiscentos ";
                    break;

                case 7:
                    centenaString = "setecentos ";
                    break;

                case 8:
                    centenaString = "oitocentos ";
                    break;

                case 9:
                    centenaString = "novecentos ";
                    break;

                default:
                    break;
                
            }

            switch (dezena) {
                case 1:
                    switch (unidade) {
                        case 0:
                            dezenaString = "dez";
                            break;

                        case 1:
                            dezenaString = "onze";
                            break;

                        case 2:
                            dezenaString = "doze";
                            break;

                        case 3:
                            dezenaString = "treze";
                            break;

                        case 4:
                            dezenaString = "quatorze";
                            break;

                        case 5:
                            dezenaString = "quinze";
                            break;

                        case 6:
                            dezenaString = "dezes";
                            break;

                        case 7:
                            dezenaString = "dezes";
                            break;

                        case 8:
                            dezenaString = "dez";
                            break;

                        default:
                            dezenaString = "deze";
                            break;
                    }

                case 2:
                    dezenaString = "vinte ";
                    break;

                case 3:
                    dezenaString = "trinta ";
                    break;

                case 4:
                    dezenaString = "quarenta ";
                    break;

                case 5:
                    dezenaString = "cinquenta ";
                    break;

                case 6:
                    dezenaString = "sessenta ";
                    break;

                case 7:
                    dezenaString = "setenta ";
                    break;

                case 8:
                    dezenaString = "oitenta ";
                    break;

                case 9:
                    dezenaString = "noventa ";
                    break;

                default:
                    break;
            }

            switch (unidade) {
                case 1:
                    unidadeString = "um.";
                    break;

                case 2:
                    unidadeString = "dois.";
                    break;

                case 3:
                    unidadeString = "três.";
                    break;

                case 4:
                    unidadeString = "quatro.";
                    break;

                case 5:
                    unidadeString = "cinco.";
                    break;

                case 6:
                    unidadeString = "seis.";
                    break;

                case 7:
                    unidadeString = "sete.";
                    break;

                case 8:
                    unidadeString = "oito.";
                    break;

                case 9:
                    unidadeString = "nove.";
                    break;

                default:
                    break;
            }

            if (dezena == 1) {
                System.out.println(centenaString);
                if (condition) {
                    System.out.println( + dezenaString + unidadeString);
                }

            }
            else {
                System.out.println(centenaString + "e " + dezenaString + "e " + unidadeString);

            }

        }
    }
}
