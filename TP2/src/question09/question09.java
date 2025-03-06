package question09;

import java.util.Scanner;

public class question09 {

    public void passwordValidation() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cadastre uma senha: ");
        String password = sc.nextLine();

        String passwordTyped;

        do {
            System.out.print("Digite a senha novamente: ");
            passwordTyped = sc.nextLine();

            if (!passwordTyped.equals(password)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!passwordTyped.equals(password));

        System.out.println("Senha correta! Acesso permitido.");

        sc.close();

    }

    public static void main(String[] args) {

        question09 quest = new question09();
        quest.passwordValidation();

    }
}
