package question11;

import java.util.Scanner;

public class question11 {

    public void numericalSequence() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int initialValue = sc.nextInt();

        System.out.print("Digite o valor do incremento: ");
        int increment = sc.nextInt();

        System.out.print("Sequência: ");
        for (int i = initialValue; i <= 100; i += increment) {
            System.out.print(i);
            if (i + increment <= 100) {
                System.out.print(", ");
            }
        }
        System.out.println();

        sc.close();

    }

    public static void main(String[] args) {

        question11 quest = new question11();
        quest.numericalSequence();

    }

}
