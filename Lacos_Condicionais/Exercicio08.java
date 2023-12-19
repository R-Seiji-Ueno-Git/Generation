package Exercicios;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 1000;

        int codigo;
        System.out.println("Operação:");
        codigo = input.nextInt();

        switch (codigo) {
            case 1:
                System.out.printf("Saldo: R$ %.2f\n", saldo);
                break;
            case 2:
                double valor = input.nextFloat();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.printf("Saldo: R$ %.2f\n", saldo);
                }
                break;
            case 3:
                double valor = input.nextFloat();
                if (valor < 0) {
                    System.out.println("Valor inválido!");
                } else {
                    saldo += valor;
                    System.out.printf("Saldo: R$ %.2f\n", saldo);
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }
}
