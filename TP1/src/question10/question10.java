package question10;

import java.util.Scanner;

public class question10 {

    public void start () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Insira sua idade aproximada: ");
        int age = sc.nextInt();

        System.out.println("Nome: " + nome + " Age: " + age);

    }

    public static void main(String[] args) {

        question10 quest = new question10();
        quest.start();

    }
}
