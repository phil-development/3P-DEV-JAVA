package question09;

import java.util.Scanner;

public class question09 {

    public void start () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Insira sua idade aproximada: ");
        int age = sc.nextInt();

        System.out.println("Nome: " + nome + " Age: " + age);

    }

    public static void main(String[] args) {

        question09 quest = new question09();
        quest.start();

    }
}