package question07;


import java.text.DecimalFormat;
import java.util.Scanner;

public class question07 {

    public void incomeTaxCalculator() {

        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormatf = new DecimalFormat("0.00");
        
        System.out.print("Digite o salário bruto anual: R$ ");
        double salaryGrossAnnual = sc.nextDouble();
        
        double incomeTax = 0;
        double netSalary = 0;
        double monthlySalary = salaryGrossAnnual / 12.0;
        
        if (monthlySalary <= 2112.00) {
            incomeTax = 0;
            netSalary = salaryGrossAnnual;

        } else if (monthlySalary <= 2826.65) {
            incomeTax = (salaryGrossAnnual * 0.075) - (158.40*12);
            netSalary = salaryGrossAnnual - incomeTax;
        } else if (monthlySalary <= 3751.05) {
            incomeTax = (salaryGrossAnnual * 0.15) - (370.40 * 12);
            netSalary = salaryGrossAnnual - incomeTax;

        } else if (monthlySalary <= 4664.68){
            incomeTax = (salaryGrossAnnual * 0.225) - (651.73 * 12);
            netSalary = salaryGrossAnnual - incomeTax;
        } else {
            incomeTax = (salaryGrossAnnual * 0.275) - (884.96 * 12);
            netSalary = salaryGrossAnnual - incomeTax;
        }
        
        System.out.println("\n--- Resultado ---");
        System.out.println("Salário bruto anual: R$ " + decimalFormatf.format(salaryGrossAnnual));
        System.out.println("Imposto de renda a pagar: R$ " + decimalFormatf.format(incomeTax));
        System.out.println("Salário líquido anual: R$ " + decimalFormatf.format(netSalary));

    }

    public static void main(String[] args) {

        question07 quest = new question07();
        quest.incomeTaxCalculator();

    }

}
