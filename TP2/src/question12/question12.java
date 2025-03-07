package question12;

import java.util.Scanner;

public class question12 {

    public void wordCounter() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] words = frase.split("\\s+");

        int wordQuantity = words.length;

        System.out.println("A frase contém " + wordQuantity + " palavras.");

        sc.close();

    }

    public static void main(String[] args) {

        question12 quest = new question12();
        quest.wordCounter();

    }

}
