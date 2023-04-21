package samouczekJavaSklepInternetowy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Koszyk {

    private List<Double> towaryWKoszyku = new ArrayList<Double>();
    Scanner scanner = new Scanner(System.in);
    public void dodajPrzedmiotDoKoszyka(){
        System.out.println("Podaj numer z listy");
        double numer = scanner.nextInt();
        towaryWKoszyku.add(numer);
    }

    public List<Double> twojKoszyk(){
        return towaryWKoszyku;
    }

}
