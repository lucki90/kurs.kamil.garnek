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
            System.out.println(przedmiot); //o wlasnie o takie wypisywanie przedmiotow na ekran mi chodzilo. Good. Ale dobrze bedzie zrobic to tak, zeby uzytkownik wiedzial jaki indeks ma dany przedmiot
            //np zeby wyswietlily sie w takiej formie:
            //1. lopata
            //2. grabie
            //3. ziemia
            
           // i wtedy jak uzytkownik bedzie chcial dodac grabie, to wpisze w konsoli '2' 
        }
    }

    //metody na przyszlosc:
    //dodajNowyProduktDoSklepu
    //usunProduktZOferty
    
    //obsluga ilosci towarow na stanie. Np. sklep ma do dyspozycji 10 lopat, jak uzytkownik pobierze jedna do koszyka to zostanie 9 itd. a jak sie skoncza to wypisac komunikat
}
