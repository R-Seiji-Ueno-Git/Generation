package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Solicita o salário base
        System.out.println("Digite o salário base:");
        double salarioBase = leia.nextDouble();

        // Solicita o abono mensal
        System.out.println("Digite o abono mensal:");
        double abonoMensal = leia.nextDouble();

        // Calcula o novo salário
        double novoSalario = salarioBase + abonoMensal;

        // Exibe o novo salário
        System.out.println("Novo salário: " + novoSalario);
    }
}
