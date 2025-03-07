package question05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class question05 {

    public void discountCalculator () {

        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.print("Insira o valor da compra: R$: ");
        double value = sc.nextDouble();

        double discount = 0;

        if (value >= 1000) {
            discount = value * 0.10;
        } else if (value >= 500) {
            discount = value * 0.05;
        }

        double finalValue = value - discount;

        System.out.println("\n--- Resultado ---");
        System.out.println("Valor da compra: R$" + decimalFormat.format(value));
        System.out.println("Valor do desconto: R$" + decimalFormat.format(discount));
        System.out.println("Valor da compra: R$" + decimalFormat.format(finalValue));

        sc.close();

    }

    public static void main(String[] args) {

        question05 quest = new question05();
        quest.discountCalculator();

    }

}
