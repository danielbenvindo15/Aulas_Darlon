import java.util.Scanner;

public class Exercicio6{
    public static Scanner entrada = new Scanner(System.in);

    //código para definir o preço do produto
    public static float preco() {
        float valor;

        System.out.println("Digite o preço do produto: ");
        valor = entrada.nextFloat();

        return valor;
    }
    //código para definir o nome do produto
    public static String nomeProduto() {
        String nome;

        System.out.println("Digite o nome do produto: ");
        nome = entrada.nextLine();

        return nome;
    }

    //código para definir o código do produto
    public static int IdProduto() {

        int id;

        System.out.println("Digite o código do produto: ");
        id = entrada.nextInt();

        return id;
    }

    //código para imprimir os valores
    public static void main(String[] args) {

        float custo;
        String nomeProdutoString;
        int codigo;

        nomeProdutoString = nomeProduto();
        
        custo = preco();

        codigo = IdProduto();

        entrada.close();

        System.out.println("----- Ficha do Produto -----");
        System.out.println("Nome:   " + nomeProdutoString);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço:  %.2f%n", custo);
        System.out.println("----------------------------");
    }
}