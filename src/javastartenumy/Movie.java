package javastartenumy;

public class Movie {
    private String title;
    private FilmType filmType;

    public Movie(String title, FilmType filmType) {
        this.title = title;
        this.filmType = filmType;
    }

    public String getTitle() {
        return title;
    }

    public FilmType getFilmType() {
        return filmType;
    }
}
