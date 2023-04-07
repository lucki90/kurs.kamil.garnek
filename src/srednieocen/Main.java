package srednieocen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*    Napisz aplikację której zadaniem jest liczenie srednich ocen z kilku przedmiotów.
            - ocena_matematyka
            - ocena_chemia
            - ocena_j_polski
            - ocena_j_angielski
            - ocena_wos
            - ocena_informatyka
        Aplikacja ma wyliczac średnią wszystkich ocen, srednią ocen z przedmiotów ścisłych (matematyka, chemia, informatyka),
        oraz średnią z ocen przedmiotów humanistycznych (pozostałe).
        Wszystkie trzy średnie mają być wypisane na ekran. Zwróć uwagę na zaokrąglenia.
        Jeśli którakolwiek z ocen jest niedostateczna, lub średnia z ocen z którejś części jest niedostateczna, to wyświetl napis:
        Ocena z [część] jest niedostateczna.*/
    public static void main(String[] args) {
        // poszczegolne wynii=ki
        Wynik angielski = new Wynik(1, Przedmioty.ANGIELSKI);
        Wynik matematyka = new Wynik(2, Przedmioty.MATEMATYKA);
        //tworzenie listy wynikow
        List<Wynik> wyniks = new ArrayList<>();
        //dodanie wynikow do listy wyniks
        wyniks.add(angielski);
        wyniks.add(matematyka);
        //Stworzenie studenta
        Student student = new Student("Pawel", wyniks);
        //Przypisanie studentowi listy wynikow

        Kalkulator kalkulator = new Kalkulator();
        System.out.println(kalkulator.sredniaWszystkichOcen(student));
    }
}
