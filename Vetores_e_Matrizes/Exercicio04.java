package Exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[][] grades = new float[10][4];
        float[] participantAverages = new float[10];

        for (int i = 0; i < grades.length; i++) {
            participantAverages[i] = calculateAverage(input, grades[i]);
        }

        System.out.println("Participante    Média");
        for (int i = 0; i < participantAverages.length; i++) {
            System.out.printf("%-12d%.1f\n", i + 1, participantAverages[i]);
        }
    }

    private static float calculateAverage(Scanner input, float[] grades) {
        float sum = 0f;
        for (int j = 0; j < grades.length; j++) {
            printGradeInput(input, j + 1);
            grades[j] = input.nextFloat();
            sum += grades[j];
        }
        return round(sum / grades.length, 1);
    }

    private static void printGradeInput(Scanner input, int noteNumber) {
        System.out.printf("Digite a nota %d: ", noteNumber);
    }

    private static float round(float value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (float) Math.round(value * scale) / scale;
    }
}
