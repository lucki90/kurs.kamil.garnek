package srednieocen;

public class Kalkulator {
    public double sredniaWszystkichOcen(Student student) { //List<Wynik> listaPrzedmiotowIOcen
        //pobranie ilosc elementow w liscie
        double iloscPrzedmiotw = student.getDzienniczek().size();
        //inicjacja sumy ocen
        double sumaOcen = 0;

        for (Wynik wynik : student.getDzienniczek()) { // 2 , 4, 5
            // dodawanie do sumaOcen oceny dla poszczególnego przedmiotu
            sumaOcen = sumaOcen + wynik.getOcena();
        }
        //zwrocenie sredniej
        return sumaOcen / iloscPrzedmiotw;
    }

    public double sredniaPrzedmiotowScislych(Student student) {
        //1. wyciagnij liste wynikow ze studenta
        //2. stworz zmienne sumaOcen
        //3. w petli dodawaj oceny TYLKO SCISLE do sumaOcen
        //4. PYTANIE: jak określisz liczbe przedmiotow scislych?
        double sumaOcen = 0;
        double iloscPrzedmiotw = 0;
        for (Wynik wynik : student.getDzienniczek()) {
            //MATEMATYKA, 2
            //POLSKI, 3
            //CHEMIA ,3
            //WOS,,4
            //ANGIELSKI 4
            if (wynik.getPrzedmiot().isCzyScisly()) {
                sumaOcen = sumaOcen + wynik.getOcena();
                iloscPrzedmiotw++;
            }
        }

        return sumaOcen / iloscPrzedmiotw;
    }

    public double sredniaPrzedmiotowNieScislych(Student student) {


        return 0;
    }
}
