package srednieocen;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String imie;
    private List<Wynik> dzienniczek = new ArrayList<>();

    public Student(String imie, List<Wynik> dzienniczek) {
        this.imie = imie;
        this.dzienniczek = dzienniczek;
    }

    public String getImie() {
        return imie;
    }

    public List<Wynik> getDzienniczek() {
        return dzienniczek;
    }
}
