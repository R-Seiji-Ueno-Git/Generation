package Exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static final double PRECO_CHOCHE_QUENTE = 10.0;
    public static final double PRECO_X_SALADA = 15.0;
    public static final double PRECO_X_BACON = 18.0;
    public static final double PRECO_BAURU = 12.0;
    public static final double PRECO_REFRIGERANTE = 8.0;
    public static final double PRECO_SUCO_LARANJA = 13.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Código do produto:");
        int codigoDoProduto = scanner.nextInt();

        System.out.println("Quantidade:");
        int quantidade = scanner.nextInt();

        switch (codigoDoProduto) {
            case 1:
                imprimeProdutoValor(codigoDoProduto, PRECO_CHOCHE_QUENTE, quantidade);
                break;
            case 2:
                imprimeProdutoValor(codigoDoProduto, PRECO_X_SALADA, quantidade);
                break;
            case 3:
                imprimeProdutoValor(codigoDoProduto, PRECO_X_BACON, quantidade);
                break;
            case 4:
                imprimeProdutoValor(codigoDoProduto, PRECO_BAURU, quantidade);
                break;
            case 5:
                imprimeProdutoValor(codigoDoProduto, PRECO_REFRIGERANTE, quantidade);
                break;
            case 6:
                imprimeProdutoValor(codigoDoProduto, PRECO_SUCO_LARANJA, quantidade);
                break;
            default:
                System.out.println("Código inválido!");
                break;
        }
    }

    private static void imprimeProdutoValor(int codigoDoProduto, double precoUnitario, int quantidade) {
        String nomeProduto = getNomeProduto(codigoDoProduto);
        double valorTotal = precoUnitario * quantidade;
        System.out.printf("Produto: %s\nValor total: R$ %.2f\n", nomeProduto, valorTotal);
    }

    private static String getNomeProduto(int codigoDoProduto) {
        switch (codigoDoProduto) {
            case 1:
                return "Cachorro Quente";
            case 2:
                return "X-Salada";
            case 3:
                return "X-Bacon";
            case 4:
                return "Bauru";
            case 5:
                return "Refrigerante";
            case 6:
                return "Suco de laranja";
            default:
                return "Produto não encontrado";
        }
    }
}
