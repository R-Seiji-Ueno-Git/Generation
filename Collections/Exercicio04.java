package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        boolean encontrado = false;

        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.println("Digite o número que você deseja encontrar: ");
        numero = input.nextInt();

        // Valida a entrada do usuário
        if (!input.hasNextInt()) {
            System.out.println("Entrada inválida. Insira um número inteiro.");
            input.nextLine(); // Remove a entrada inválida
            return;
        }

        // Itera pelo conjunto procurando o número
        encontrado = numeros.contains(numero);

        // Imprime o resultado da busca
        if (encontrado) {
            System.out.println("O número " + numero + " foi encontrado!");
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
    }
}
