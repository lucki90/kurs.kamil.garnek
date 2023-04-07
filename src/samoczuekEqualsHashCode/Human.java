package samoczuekEqualsHashCode;

public class Human {
    //Na koniec krótkie zadanie dla Ciebie. Napisz klasę reprezentującą człowieka, zaimplementuj metody hashCode i equals.
    // Zastanów się czy to, że ktoś ma to samo imię i nazwisko sprawia, że jest to ta sama osoba?
    // Jaki atrybut może posłużyć do sprawdzenia czy dwie instancje klasy Human reprezentują tę samą osobę?

    private final String name;
    private final String surname;
    private final String pesel;

    public Human(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        if (pesel == null) {
            throw new IllegalArgumentException("Every human needs to have PESEL!");
        }
        this.pesel = pesel;
    }

    public void zwrocPierwszaLittereNazwiska() {
        if ((surname == null)) {
            throw new IllegalArgumentException("naziwsko nie moe byc nullem");
        }

        String[] s = surname.split(" ");

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }



    }


}



