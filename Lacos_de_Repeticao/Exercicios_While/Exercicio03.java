package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        int menor21 = 0;
        int maior50 = 0;

        System.out.println("Digite uma idade: ");
        // confirmação se o input está correto
        while (input.hasNextInt() && (age = input.nextInt()) >= 0) {
            if (age < 21) {
                menor21++;
            } else if (age > 50) {
                maior50++;
            }
            System.out.println("Digite uma idade: ");
        }

        System.out.println("Total de pessoas menores de 21 anos: " + menor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
    }

}
