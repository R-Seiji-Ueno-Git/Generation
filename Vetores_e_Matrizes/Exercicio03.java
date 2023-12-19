package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrizNumeros = new int[3][3];
        int numero;

        // Obtém os números da matriz
        for (int linha = 0; linha < matrizNumeros.length; linha++) {
            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {
                System.out.println("Digite o número da linha " + linha + " coluna " + coluna);
                numero = input.nextInt();
                matrizNumeros[linha][coluna] = numero;
            }
        }

        // Imprime os elementos das diagonais
        imprimirDiagonalPrincipal(matrizNumeros);
        imprimirDiagonalSecundaria(matrizNumeros);

    }

    // Imprime os elementos da diagonal principal
    public static void imprimirDiagonalPrincipal(int[][] matriz) {
        System.out.println("Elementos da Diagonal Principal: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print(matriz[linha][linha] + " ");
        }
        System.out.println();
    }

    // Imprime os elementos da diagonal secundária
    public static void imprimirDiagonalSecundaria(int[][] matriz) {
        System.out.println("Elementos da Diagonal Secundária: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print(matriz[linha][matriz.length - 1 - linha] + " ");
        }
        System.out.println();
    }
}
