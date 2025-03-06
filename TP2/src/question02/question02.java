package question02;

import java.util.Scanner;

public class question02 {

    public void calculator() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double grade1 = sc.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double grade2 = sc.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double grade3 = sc.nextDouble();

        System.out.println("Insira a quarta nota: ");
        double grade4 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println("\n --- Resultado ---");
        System.out.println("Média: " + average);

        if (average >= 7) {
            System.out.println("Aprovado!");
        } else if (average >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }

    public static void main(String[] args) {

        question02 quest = new question02();
        quest.calculator();

    }

}
