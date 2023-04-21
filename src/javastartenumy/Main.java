package javastartenumy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Movie> filmList = Arrays.asList(
                new Movie("Titanic", FilmType.ROMANTIC),
                new Movie("Pila", FilmType.HORROR),
                new Movie("The Office", FilmType.COMEDY),
                new Movie("Matrix", FilmType.SCFI));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kategorie filmu");

        FilmType[] filmTypes = FilmType.values();

        for (FilmType filmType : filmTypes) {
            System.out.println(filmType.name());
        }
        String userChoice = scanner.nextLine();

        FilmType filmType = FilmType.valueOf(userChoice);

        System.out.println("Filmy z tej kategorii:");
        for (Movie movie : filmList) {
            if (movie.getFilmType() == filmType)
                System.out.println(movie.getTitle() + " " + movie.getFilmType());
        }

    }

}

