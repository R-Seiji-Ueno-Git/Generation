package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String nomeColaborador;
    int codigoCargo;
    double salarioBase;

    System.out.println("Digite o nome do colaborador");
    nomeColaborador = input.nextLine();
    System.out.println("Cargo");
    codigoCargo = input.nextInt();
    System.out.println("Salário");
    salarioBase = input.nextDouble();

    double bonus = 0;
    String cargoName = "";

    switch (codigoCargo) {
        case 1:
            bonus = salarioBase * 0.1;
            cargoName = "Gerente";
            break;
        case 2:
            bonus = salarioBase * 0.07;
            cargoName = "Vendedor";
            break;
        case 3:
            bonus = salarioBase * 0.09;
            cargoName = "Supervisor";
            break;
        case 4:
            bonus = salarioBase * 0.06;
            cargoName = "Motorista";
            break;
        case 5:
            bonus = salarioBase * 0.05;
            cargoName = "Estoquista";
            break;
        case 6:
            bonus = salarioBase * 0.08;
            cargoName = "Técnico de TI";
            break;
        default:
            System.out.println("Código inválido!");
            return;
    }

    double salarioTotal = salarioBase + bonus;

    System.out.println("Nome do colaborador: " + nomeColaborador);
    System.out.println("Cargo: " + cargoName);
    System.out.println("Salário: R$ " + String.format("%.2f", salarioTotal));
}
}
