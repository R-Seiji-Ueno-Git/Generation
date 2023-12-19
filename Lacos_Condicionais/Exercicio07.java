package Exercicios;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o 1º número:");
        double num1 = input.nextDouble();

        System.out.println("Digite o 2º número:");
        double num2 = input.nextDouble();

        System.out.println("Operação (1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão):");
        int operation = input.nextInt();

        double result;
        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    result = Double.NaN;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                result = Double.NaN;
                break;
        }

        System.out.printf("%.1f %s %.1f = %.1f\n", num1, getOperationSymbol(operation), num2, result);
    }

    private static String getOperationSymbol(int operation) {
        switch (operation) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            default:
                return "";
        }
    }
}
