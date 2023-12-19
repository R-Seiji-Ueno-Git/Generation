package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] grades = new float[4];
        float average = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.printf("Digite a nota do bimestre (%d/4): ", i);
            grades[i - 1] = scanner.nextFloat();
            average += grades[i - 1];
        }
        average /= grades.length;

        System.out.printf("Média final: %.1f\n", average);
    }
}
