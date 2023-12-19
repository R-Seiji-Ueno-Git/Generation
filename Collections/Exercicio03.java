package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashSet<Integer> numeros = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            if (input.hasNextInt()) {
                int numero = input.nextInt();
                numeros.add(numero);
            } else {
                System.out.println("Entrada inválida. Insira um número inteiro.");
                input.nextLine(); // Remove a entrada inválida
            }
        }

        System.out.println("Listando dados do conjunto:");
        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
