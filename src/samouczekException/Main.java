package samouczekException;

import java.util.Scanner;

public class Main {/*
    Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
    Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
    Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
    Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.*/
Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        Matematyka math = new Matematyka();
        math.getNumber();



    }

}
