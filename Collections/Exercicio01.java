import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite a cor #%d: ", i);
            colors.add(input.nextLine());
        }

        System.out.println("Listar todas as cores:");
        System.out.println(colors);

        Collections.sort(colors);
        System.out.println("Ordenar as cores:");
        System.out.println(colors);
    }
}
