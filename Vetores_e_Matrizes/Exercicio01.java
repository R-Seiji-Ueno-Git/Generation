package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeroPesquisa;
        boolean encontrado = false;

        // Obtém os números do usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        // Verifica se o número já existe no vetor
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroPesquisa) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        // Imprime o resultado
        if (encontrado) {
            System.out.println("O número " + numeroPesquisa + " está na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroPesquisa + " não foi encontrado!");
        }
    }

    // Método para verificar se um número já existe no vetor
    public static boolean existe(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
}
