package samouczekInterfejsZad;

import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        Computation computation;


        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        } else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Wybierasz 1.mnozenie czy 2.dodawanie?");
        Scanner scanner = new Scanner(System.in);

        int numberChoice = scanner.nextInt();
        switch (numberChoice) {
            case 1:
                System.out.println("Wybrales mnozenie");
                break;
            case 2:
                System.out.println("Wybrales dodawanie");
                break;
        }
        return false;// tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)*/
    }

    private double getArgument() {

        System.out.println("Podaj liczbe: ");
        return scanner.nextDouble();


    }
}
