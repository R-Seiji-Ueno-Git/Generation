package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("\nDigite um número:");
        numero = scanner.nextInt();

        // evitar erros inicializando mensagem.
        String mensagem = "";

        if (numero % 2 == 0) {
            mensagem = "O número " + numero + " é par";
        } else {
            mensagem = "O número " + numero + " é ímpar";
        }

        if (numero < 0) {
            mensagem += " e negativo";
        } else {
            mensagem += " e positivo";
        }

        System.out.println(mensagem);
    }
}
