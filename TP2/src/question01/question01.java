package question01;

import java.util.Scanner;

public class question01 {

    public void register() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome completo: ");
        String name = sc.nextLine();

        System.out.println("Insira sua idade: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Insira o nome da sua mãe: ");
        String mothersName = sc.nextLine();

        System.out.println("Insira o nome do seu pai: ");
        String fathersName = sc.nextLine();

        System.out.println("\n--- Dados do Usuário ---\n");
        System.out.println("Nome completo: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Nome da mãe: " + mothersName);
        System.out.println("Nome do pai: " + fathersName);

        int userNameLength = name.length();
        int mathersNameLength = mothersName.length();
        int fathersNameLength = fathersName.length();

        if (userNameLength > mathersNameLength && fathersNameLength > mathersNameLength) {
            System.out.println("\nSeu nome é maior que o de seu pai e de sua mãe");
        } else if (userNameLength > mathersNameLength) {
            System.out.println("\nSeu nome é maior que o de sua mãe");
        } else if (userNameLength > fathersNameLength) {
            System.out.println("\nSeu nome é maior que o de seu pai");
        } else {
            System.out.println("\n Seu nome é menor que o de seu pai e de sua mãe");
        }

        sc.close();

    }

    public static void main(String[] args) {

        question01 quest = new question01();
        quest.register();

    }

}
