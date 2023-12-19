package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite o nome do doador:");
        nome = scanner.nextLine();

        System.out.println("Digite a idade do doador:");
        idade = scanner.nextInt();

        boolean apto = true;

        if (idade < 18) {
            apto = false;
            System.out.println("O doador deve ter pelo menos 18 anos.");
        } else if (idade > 69) {
            apto = false;
            System.out.println("O doador deve ter no máximo 69 anos.");
        } else if (idade >= 60 && isFirst) {
            apto = false;
            System.out.println("Doadores com mais de 60 anos só podem doar se não forem a primeira vez.");
        }

        if (apto) {
            System.out.println(nome + " está apto(a) para doar sangue!");
        }
    }
}
