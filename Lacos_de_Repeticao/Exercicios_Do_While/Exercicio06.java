package ExerciciosDoWhile;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber, numberOfMultiples = 0;
        float average = 0;
        
        // valor de sentinela
        int sentinel = -1;

        do {
            System.out.println("Digite um número: ");
            
            // Caso não for um int, descarte
            while (!input.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                input.next();
            }
            userNumber = input.nextInt();
            
            if (userNumber % 3 == 0 && userNumber != sentinel) {
                average += userNumber;
                numberOfMultiples++;
            }
        } while (userNumber % 3 == 0 && userNumber != sentinel);

        if (numberOfMultiples > 0) {
            average /= numberOfMultiples;
            System.out.printf("A média de todos os números múltiplos de 3 é: %.1f\n", average);
        } else {
            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
        }
    }
}
