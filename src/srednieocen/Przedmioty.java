package srednieocen;

public enum Przedmioty {
    MATEMATYKA(true, false),
    CHEMIA(true, false),
    POLSKI(false, true),
    ANGIELSKI(false, true),
    WOS(false, true),
    INFORMATYKA(true, false);

    private boolean czyScisly;
    private boolean czyHumanistyczny;

    Przedmioty(boolean czyScisly, boolean czyHumanistyczny) {

        this.czyScisly = czyScisly;
        this.czyHumanistyczny = czyHumanistyczny;
    }

    public boolean isCzyScisly() {
        return czyScisly;
    }

    public boolean isCzyHumanistyczny(){
        return czyHumanistyczny;
    }
}
