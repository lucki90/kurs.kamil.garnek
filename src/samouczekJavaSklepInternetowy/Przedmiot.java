package samouczekJavaSklepInternetowy;

public class Przedmiot {
    private String name;
    private double cena;

    @Override
    public String toString() {
        return "Przedmiot{" +
                "name='" + name + '\'' +
                ", cena=" + cena +
                '}';
    }

    public Przedmiot  (String name, double cena) {
        this.name = name;
        this.cena = cena;
    }
    public String getName() {
        return name;
    }

    public double getCena() {
        return cena;
    }
}
