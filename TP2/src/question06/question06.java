package question06;

import java.util.Scanner;

public class question06 {

    public void leapYear() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um ano: ");
        int year = sc.nextInt();

        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        if (isLeap) {
            System.out.println(year + " é um ano bissexto");
        } else {
            System.out.println(year + " não é um ano bissexto");
        }

        sc.close();

    }

    public static void main(String[] args) {

        question06 quest = new question06();
        quest.leapYear();

    }

}
