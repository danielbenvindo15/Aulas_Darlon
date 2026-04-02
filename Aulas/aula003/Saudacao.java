package Aulas.aula003;
import java.util.Scanner;

public class Saudacao {

    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        entrada.close();//desativa o teclado

        System.out.println("Olá " + nome + ". Seja bem vindo ao Albion Online!");



        
    }
    
}