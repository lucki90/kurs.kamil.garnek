package srednieocen;

public enum Przedmioty {
    MATEMATYKA(true),
    CHEMIA(true),
    POLSKI(false),
    ANGIELSKI(false),
    WOS(false),
    INFORMATYKA(true);

    private boolean czyScisly;

    Przedmioty(boolean czyScisly) {

        this.czyScisly = czyScisly;
    }

    public boolean isCzyScisly() {
        return czyScisly;
    }
}
