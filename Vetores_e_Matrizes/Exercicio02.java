package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        float average;
        String evenNumbers = "";
        String oddNumbers = "";

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];

            if (numbers[i] % 2 == 0) {
                evenNumbers += numbers[i] + " ";
            } else {
                oddNumbers += numbers[i] + " ";
            }
        }

        average = (float) sum / numbers.length;

        System.out.println("Elementos pares: " + evenNumbers);
        System.out.println("Elementos ímpares: " + oddNumbers);
        System.out.println("Soma: " + sum);
        System.out.println("Média: " + String.format("%.2f", average));
    }
}
