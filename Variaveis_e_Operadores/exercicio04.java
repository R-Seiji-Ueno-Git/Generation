package Exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] valores = new float[4];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
                valores[i] = Float.parseFloat(scanner.nextLine());
        }

        float diferenca = calcularDiferenca(valores[0], valores[1], valores[2], valores[3]);

        System.out.println("Diferença: " + diferenca);
    }

    private static float calcularDiferenca(float produto1, float produto2, float produto3, float produto4) {
        return ((produto1 * produto2) - (produto3 * produto4));
    }
}
