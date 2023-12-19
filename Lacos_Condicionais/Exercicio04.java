package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoDeAnimal;
        String classe;
        String alimentacao;

        System.out.println("Digite o tipo de animal:");
        tipoDeAnimal = scanner.nextLine();

        System.out.println("Digite a classe do animal:");
        classe = scanner.nextLine();

        System.out.println("Digite a alimentação do animal:");
        alimentacao = scanner.nextLine();

        String animal = "";

        if (tipoDeAnimal.equalsIgnoreCase("Vertebrado")) {
            if (classe.equalsIgnoreCase("Ave")) {
                if (alimentacao.equalsIgnoreCase("Carnívoro")) {
                    animal = "Águia";
                } else if (alimentacao.equalsIgnoreCase("Onívoro")) {
                    animal = "Pomba";
                } else {
                    animal = "Palavra inválida!";
                }
            } else if (classe.equalsIgnoreCase("Mamífero")) {
                if (alimentacao.equalsIgnoreCase("Onívoro")) {
                    animal = "Homem";
                } else if (alimentacao.equalsIgnoreCase("Herbívoro")) {
                    animal = "Vaca";
                } else {
                    animal = "Palavra inválida!";
                }
            } else {
                animal = "Palavra inválida!";
            }
        } else if (tipoDeAnimal.equalsIgnoreCase("Invertebrado")) {
            if (classe.equalsIgnoreCase("Inseto")) {
                if (alimentacao.equalsIgnoreCase("Hematófago")) {
                    animal = "Pulga";
                } else if (alimentacao.equalsIgnoreCase("Herbívoro")) {
                    animal = "Lagarta";
                } else {
                    animal = "Palavra inválida!";
                }
            } else if (classe.equalsIgnoreCase("Anelídeo")) {
                if (alimentacao.equalsIgnoreCase("Hematófago")) {
                    animal = "Sanguessuga";
                } else if (alimentacao.equalsIgnoreCase("Onívoro")) {
                    animal = "Minhoca";
                } else {
                    animal = "Palavra inválida!";
                }
            } else {
                animal = "Palavra inválida!";
            }
        } else {
            animal = "Palavra inválida!";
        }

        System.out.println(animal);
    }
}
