package samouczekJavaSklepInternetowy;

import java.util.ArrayList;
import java.util.List;

public class Sklep {
    List<Przedmiot> towaryNaStanie = new ArrayList<>();

    public void przygotujTowary() {
        towaryNaStanie.add(new Przedmiot("lopata", 10));
        towaryNaStanie.add(new Przedmiot("grabie", 5));
        towaryNaStanie.add(new Przedmiot("ziemia", 4));

    }

    public void wyswietlTowary() {
        for (Przedmiot przedmiot : towaryNaStanie) {
            System.out.println(przedmiot);
        }
    }


}
