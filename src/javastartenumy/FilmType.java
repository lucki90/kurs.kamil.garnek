package javastartenumy;

public enum FilmType {
    HORROR("Horror"),
    COMEDY("Komedia"),
    ROMANTIC("Romantyczny"),
    SCFI("Sience Fiction");

    String displayName;

    FilmType(String displayName) {
        this.displayName = displayName;
    }
//metoda pozwalajaca na dostep do displatname

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}




