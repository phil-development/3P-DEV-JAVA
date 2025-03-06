package question08;

import java.util.Scanner;

public class question08 {

    public void triangleType() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado:");
        double side1 = sc.nextDouble();

        System.out.println("Digite o comprimento do segundo lado:");
        double side2 = sc.nextDouble();

        System.out.println("Digite o comprimento do terceiro lado:");
        double side3 = sc.nextDouble();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {

            if (side1 == side2 && side2 == side3) {
                System.out.println("Triângulo equilátero.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }

        } else {
            System.out.println("As medidas fornecidas não formam um triângulo válido.");
        }

        sc.close();
    }

    public static void main(String[] args) {

        question08 quest = new question08();
        quest.triangleType();

    }

}
