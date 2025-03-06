package question10;

import java.util.Random;
import java.util.Scanner;

public class question10 {

    public void guessingGame() {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto (entre 1 e 100).");

        for (attempts = 1;; attempts++) {
            System.out.print("Digite seu palpite: ");
            guess = sc.nextInt();

            if (guess < secretNumber) {
                System.out.println("Palpite muito baixo. Tente novamente.");
            } else if (guess > secretNumber) {
                System.out.println("Palpite muito alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + attempts + " tentativas.");
                break;
            }
        }

        sc.close();

    }

    public static void main(String[] args) {

        question10 quest = new question10();
        quest.guessingGame();

    }

}
