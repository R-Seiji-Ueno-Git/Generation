package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroA, numeroB, comparacaoC;

        System.out.println("\nDigite o número A:");
        numeroA = scanner.nextInt();

        System.out.println("\nDigite o número B:");
        numeroB = scanner.nextInt();

        System.out.println("\nDigite o número C:");
        comparacaoC = scanner.nextInt();

        if (numeroA + numeroB > comparacaoC) {
            System.out.println("Soma maior que C");
        } else {
            System.out.println("Soma menor ou igual a C");
        }
    }
}
