package question07;

import java.time.LocalDate;

public class question07 {

    public void start() {

        LocalDate currentDate = LocalDate.now();
        String name = "Filipe";

        System.out.println("Olá, meu nome é " + name + ", e hoje é " + currentDate);

    }

    public static void main(String[] args) {

        question07 quest = new question07();
        quest.start();

    }
}
