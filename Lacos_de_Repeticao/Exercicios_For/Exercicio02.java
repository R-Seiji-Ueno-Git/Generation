package ExerciciosFor;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenCount = 0; // par
        int oddCount = 0; // impar

        for (int i = 1; i <= 10 && evenCount < 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            // confirmação se é um int
            if (input.hasNextInt()) {
                int userNumber = input.nextInt();
                if (userNumber % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            } else {
                System.err.println("Entrada inválida. Digite um número inteiro.");
                input.nextLine(); // retira o numero errado do input
            }
        }

        System.out.println("Total de números pares: " + evenCount);
        System.out.println("Total de números ímpares: " + oddCount);
    }
}
