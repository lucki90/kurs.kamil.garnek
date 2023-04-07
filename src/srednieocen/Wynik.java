package srednieocen;

public class Wynik {
    private int ocena;
    private Przedmioty przedmiot;

    public Wynik(int ocena, Przedmioty przedmiot) {
        this.ocena = ocena;
        this.przedmiot = przedmiot;

    }

    public int getOcena() {
        return ocena;
    }

    public Przedmioty getPrzedmiot() {
        return przedmiot;
    }
}
