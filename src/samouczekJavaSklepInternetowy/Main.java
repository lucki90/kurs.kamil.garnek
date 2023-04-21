package samouczekJavaSklepInternetowy;

import java.util.Scanner;

public class Main {


    //Napisz program, który będzie reprezentował koszyk w sklepie internetowym.
    // Do koszyka reprezentowanego przez klasę Basket możemy dodawać bądź usuwać kolejne przedmioty.
    // Każdy przedmiot powinien mieć nazwę i cenę jednostkową.
    // Koszyk powinien także pozwalać na dodanie/usunięcie od razu kilku egzemplarzy przedmiotu ze sklepu.
    // Koszyk powinien także być w stanie policzyć sumaryczną wartość zamówienia oraz wyświetlić swoją zawartość.
    // Pamiętaj o poprawnym obsłużeniu sytuacji wyjątkowych np. usunięcie elementów z pustego koszyka czy dodaniu ujemnej liczby przedmiotów.

    public static void main(String[] args) {

        System.out.println("Witamy w naszym sklepie internetowym");

        Scanner scanner = new Scanner(System.in);
        Sklep sklep = new Sklep();
        Koszyk koszyk = new Koszyk();
        sklep.przygotujTowary();
        boolean czyKontynuowacZakupy = true;

        while (czyKontynuowacZakupy) {
            System.out.println("Wybierz jedna z opcji:");
            System.out.println("1.Wyswietl liste przygotowanych towarow");
            System.out.println("2.Dodaj towar do koszyka");
            System.out.println("3.usun towar z koszyka");
            System.out.println("4.Wyswietl swoj koszyk");
            System.out.println("5.Wartosc rachunku");
            System.out.println("6.Wyjscie");

            int wyborUzytkownia = scanner.nextInt();

            switch (wyborUzytkownia) {
                case 1 -> sklep.wyswietlTowary();
                case 2 -> koszyk.dodajPrzedmiotDoKoszyka();
                case 3 -> System.out.println("wybrano 3");
                case 4 -> System.out.println(koszyk.twojKoszyk());
                case 5 -> System.out.println("wybrano 5");
                case 6 -> czyKontynuowacZakupy = false;
            }


        }


    }
}