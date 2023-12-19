package ExerciciosDoWhile;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        do {
            System.out.println("Digite um número positivo: ");
            int positiveNumber = input.nextInt();

            if (positiveNumber > 0) {
                sum += positiveNumber;
            } else if (positiveNumber <= 0) {
                break; // Early exit if non-positive entered
            }
        } while (positiveNumber > 0); // Simplified loop condition

        System.out.println("A soma dos números positivos é: " + sum);
    }
}
