package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

    private static final Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        displayMenu();

        do {
            option = input.nextInt();
            switch (option) {
                case 1:
                    addCustomer(input);
                    break;
                case 2:
                    listCustomers();
                    break;
                case 3:
                    callNextCustomer();
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
        System.out.println("\n****************************************");
        System.out.println("\t\tMenu:");
        System.out.println("\t1 - Adicionar Cliente na Fila");
        System.out.println("\t2 - Listar todos os Clientes");
        System.out.println("\t3 - Chamar próximo Cliente");
        System.out.println("\t0 - Sair");
        System.out.println("****************************************");
        System.out.print("Digite sua opção: ");
    }

    private static void addCustomer(Scanner input) {
        input.nextLine(); // Clear previous input buffer
        System.out.println("Digite o nome do cliente: ");
        String name = input.nextLine();
        queue.offer(name); // Use offer instead of add to handle potential queue full situation
        System.out.println("Cliente " + name + " adicionado à fila!");
    }

    private static void listCustomers() {
        if (queue.isEmpty()) {
            System.out.println("A fila está vazia!");
        } else {
            System.out.println("Lista de Clientes na Fila:");
            for (String name : queue) {
                System.out.println(name);
            }
        }
    }

    private static void callNextCustomer() {
        if (queue.isEmpty()) {
            System.out.println("A fila está vazia!");
        } else {
            String name = queue.poll();
            System.out.println("Chamando próximo cliente: " + name);
        }
    }
}
