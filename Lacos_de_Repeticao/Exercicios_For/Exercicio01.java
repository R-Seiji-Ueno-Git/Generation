package ExerciciosFor;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número do intervalo: ");
        int lowerBound = input.nextInt();

        System.out.println("Digite o último número do intervalo: : ");
        int upperBound = input.nextInt();
        
        if (lowerBound > upperBound) {
            System.out.println("Erro: Intervalo inválido!");
            return;
        }

        boolean found = false; // Flag para se multiplos forem encontrados

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Não há múltiplos de 3 e 5 no intervalo fornecido.");
        }
    }
}