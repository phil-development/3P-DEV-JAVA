package question04;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;

public class question04 {

    public void ageCalculator () {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o dia do seu nascimento: ");
        String day = sc.nextLine();

        System.out.print("Insira o mês do seu nascimento: ");
        String month = sc.nextLine();

        System.out.print("Insira o ano do seu nascimento: ");
        String year = sc.nextLine();

        LocalDate today = LocalDate.now();

        LocalDate birthday = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));

        long days = ChronoUnit.DAYS.between(birthday, today);

        System.out.print("Sua idade em dias: " + days);

        sc.close();

    }

    public static void main(String[] args) {

        question04 quest = new question04();
        quest.ageCalculator();

    }
}
