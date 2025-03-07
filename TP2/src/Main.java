import question01.question01;
import question02.question02;
import question03.question03;
import question04.question04;
import question05.question05;
import question06.question06;
import question07.question07;
import question08.question08;
import question09.question09;
import question10.question10;
import question11.question11;
import question12.question12;

public class Main {

    // Basta descomentar o medotodo da questão que deseja executar
    // ou
    // Executar diretamente o arquivo da questão

    public static void main(String[] args) {

        question01 quest01 = new question01();
        quest01.register();

        question02 quest02 = new question02();
        // quest02.calculator();

        question03 quest03 = new question03();
        // quest03.currencyConverter();

        question04 quest04 = new question04();
        // quest04.ageCalculator();

        question05 quest05 = new question05();
        // quest05.discountCalculator();

        question06 quest06 = new question06();
        // quest06.leapYear();

        question07 quest07 = new question07();
        // quest07.incomeTaxCalculator();

        question08 quest08 = new question08();
        // quest08.triangleType();

        question09 quest09 = new question09();
        // quest09.passwordValidation();

        question10 quest10 = new question10();
        // quest10.guessingGame();

        question11 quest11 = new question11();
        // quest11.numericalSequence();

        question12 quest12 = new question12();
        // quest12.wordCounter();


    }
}