package samouczekException;

import java.util.Scanner;



public class Matematyka {
    Scanner scanner = new Scanner(System.in);
    private double number = 0;

    public void getNumber() {
        System.out.println("Podaj liczbe");
        double number = scanner.nextDouble();

        if (number<0){
            try {
                throw new IllegalAccessException("Podaj liczbe wieksza od zera");
            }
            catch (IllegalAccessException e){
                System.out.println(e);
                System.out.println("Pierwiastek z liczby" + (number)*-1+ " wynosi" + Math.sqrt(
                        (number)*-1));

                //wywolanie metody poprzez obiekt
                /**
                 * Matematyka matma = new Matematyka();
                 * matma.getNumber()
                 */
                //Wywolannie metody statycznej odwolujac sie do nazwy klasy
                /**
                 * Matematyka.getNumber()
                 */
            }
        }else {
          //  System.out.println("Pierwiastek z liczby" + number +"wynosi"+SquareRoot(number));
        }


    }


}
