package Aulas.aula001;
public class Main {

    
    public static void main(String[] args){
        //imprimirMensagem();
        imprimirExpressao();
        exercicio11();

    }

    public static void imprimirMensagem(){
        System.out.println("Hello World");
    }

    public static void imprimirExpressao(){
        int A = 5;
        int B = 10;
        int C = -8;
        double D = 1.5;
        
        System.out.println(2 * A % 3 - C);
        
    }

    public static void exercicio11(){
        int P = 2;
        int Q = 3;
        int R = 12;
        double S = 4.5;

        System.out.println((100 * Q) / P + R);
        System.out.println(R % (P - 1) - Q * R);
        System.out.println(P * R % 5 - Q / 2);

    }

}