package question03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class question03 {

    public void currencyConverter() {

        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double dollarRate = 5.20;
        double euroRate = 5.60;
        double poundRate = 6.50;

        System.out.println("Insira o valor em reais: ");
        double realValue = sc.nextDouble();

        System.out.println("Insira a moeda de destino (dolar, euro ou libra): ");
        String destinationCurrency = sc.next().toLowerCase();

        double convertedValue = 0;
        String currencySymbol = "";

        switch (destinationCurrency) {

            case "dollar":
                convertedValue = realValue / dollarRate;
                currencySymbol = "US$";
                break;

            case "euro":

                convertedValue = realValue / euroRate;
                currencySymbol = "€ ";
                break;

            case "pound":

                convertedValue = realValue / poundRate;
                currencySymbol = "£ ";
                break;

            default:
                System.out.println("Moeda inválida!");
                sc.close();
                return;
        }

        System.out.println("Valor em reais: " + currencySymbol + decimalFormat.format(convertedValue));
        sc.close();

    }

    public static void main(String[] args) {

        question03 quest = new question03();
        quest.currencyConverter();

    }

}
