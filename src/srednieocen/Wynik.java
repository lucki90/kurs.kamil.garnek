package srednieocen;

public class Wynik {
    private double ocena;
    private Przedmioty przedmiot;

    public Wynik(double ocena, Przedmioty przedmiot) {
        this.ocena = ocena;
        this.przedmiot = przedmiot;

    }

    public double getOcena() {
        return ocena;
    }

    public Przedmioty getPrzedmiot() {
        return przedmiot;
    }

}
