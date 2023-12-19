package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário bruto
        System.out.println("Digite o salário bruto:");
        float salarioBase = scanner.nextFloat();

        // Solicita o adicional noturno
        System.out.println("Digite o adicional noturno:");
        float adicionalNoturno = scanner.nextFloat();

        // Solicita as horas extras
        System.out.println("Digite as horas extras:");
        float horasExtras = scanner.nextFloat();

        // Solicita os descontos
        System.out.println("Digite os descontos:");
        float descontos = scanner.nextFloat();

        // Calcula o salário líquido
        float salarioLiquido = calcularSalarioLiquido(salarioBase, adicionalNoturno, horasExtras, descontos);

        // Exibe o salário líquido
        System.out.println("Salário líquido: " + salarioLiquido);
    }

    private static float calcularSalarioLiquido(float salarioBase, float adicionalNoturno, float horasExtras, float descontos) {
        // Valida os dados
        if (salarioBase < 0) {
            System.out.println("O salário base deve ser maior ou igual a zero.");
        }

        if (adicionalNoturno < 0) {
            System.out.println("O adicional noturno deve ser maior ou igual a zero.");
        }

        if (horasExtras < 0) {
            System.out.println("As horas extras devem ser maior ou igual a zero.");
        }

        if (descontos < 0) {
            System.out.println("Os descontos devem ser maior ou igual a zero.");
        }

        // Calcula o salário líquido
        return salarioBase + adicionalNoturno + (horasExtras * 5) - descontos;
    }
}
