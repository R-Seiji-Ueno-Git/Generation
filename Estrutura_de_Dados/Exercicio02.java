package Exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

    private static final Stack<String> pilha = new Stack<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        displayMenu();

        do {
            option = input.nextInt();
            switch (option) {
                case 1:
                    addBook(input);
                    break;
                case 2:
                    listBooks();
                    break;
                case 3:
                    removeBook();
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.printf("Opção inválida!\n");
                    displayMenu();
                    break;
            }
        } while (option != 0);
    }

    private static void displayMenu() {
        System.out.println("\n********************************************************");
        System.out.println("\t\tMenu:");
        System.out.println("\t1 - Adicionar Livro na pilha");
        System.out.println("\t2 - Listar todos os Livros");
        System.out.println("\t3 - Retirar Livro da pilha");
        System.out.println("\t0 - Sair");
        System.out.println("********************************************************");
        System.out.print("Digite sua opção: ");
    }

    private static void addBook(Scanner input) {
        input.nextLine(); // Clear previous input buffer
        System.out.println("Digite o nome do livro: ");
        String nome = input.nextLine();
        pilha.push(nome);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void listBooks() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println("Lista de Livros na Pilha:");
            for (String livro : pilha) {
                System.out.println(livro);
            }
        }
    }

    private static void removeBook() {
        if (pilha.isEmpty()) {
            System.out.println("A Pilha está vazia!");
        } else {
            String livro = pilha.pop();
            System.out.println("Livro removido: " + livro);
        }
    }
}
