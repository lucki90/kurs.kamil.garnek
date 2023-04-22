package samouczekJavaSklepInternetowy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Koszyk { //rob ctrl + alt + l - zeby ladniej Ci sie kod formatowal, bo np. powinien byc odstep miedzy polami a metodami

    private List<Double> towaryWKoszyku = new ArrayList<Double>(); //to powinna byc Lista<Towar>... 
    Scanner scanner = new Scanner(System.in);
    public void dodajPrzedmiotDoKoszyka(){ 
        System.out.println("Podaj numer z listy"); //troche bez sensu. Na poczatek tutaj w parametrze powinna byc przekazana list<Towarow> w parametrze i z tej listy towarow uzytkownik powinien pobrac
        //element listy o numerze ktory wpisze w konsoli i wtedy dodac go do listy towaryWKoszyku
        double numer = scanner.nextInt();
        towaryWKoszyku.add(numer);
    }

    public List<Double> twojKoszyk(){ //lepiej wyswietlac elementy listy w petli
        return towaryWKoszyku;
    }

}
