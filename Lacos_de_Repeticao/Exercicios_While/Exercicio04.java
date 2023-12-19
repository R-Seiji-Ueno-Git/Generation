package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        int genderIdentity;
        int developerType;
        int NumBack = 0, NumFront = 0, NumHMob40 = 0, NumNBFullstackM30 = 0, total = 0;
        float media = 0;
        char continuar = 'S';

        while (continuar != 'N') {
            System.out.println("Idade: ");
            age = input.nextInt();

            System.out.println("Identidade de Gênero: ");
            genderIdentity = input.nextInt();

            System.out.println("Pessoa Desenvolvedora: ");
            developerType = input.nextInt();

            continuar = input.next().charAt(0);

            switch (developerType) {
                case 1:
                    NumBack++;
                    break;
                case 2:
                    if (genderIdentity == 1 || genderIdentity == 4) {
                        NumFront++;
                    }
                    break;
                case 3:
                    if (genderIdentity == 2 || genderIdentity == 5) {
                        if (age > 40) {
                            NumHMob40++;
                        }
                    }
                    break;
                case 4:
                    if (genderIdentity == 3) {
                        if (age < 30) {
                            NumNBFullstackM30++;
                        }
                    }
                    break;
            }

            total++;
            media += age;
        }

        media /= total;

        System.out.println("Total de pessoas desenvolvedoras Backend: " + NumBack);
        System.out.println("\nTotal de mulheres Cis e Trans desenvolvedoras Frontend: " + NumFront);
        System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + NumHMob40);
        System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + NumNBFullstackM30);
        System.out.println("\nNúmero total de pessoas que responderam à pesquisa: " + total);
        System.out.println("A média de idade das pessoas que responderam à pesquisa: " + String.format("%.2f", media));
    }

}
