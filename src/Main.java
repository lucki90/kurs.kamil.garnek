public class Main {
    public static void main(String[] args) {

        Oven oven = new Oven();
        BakingOven bakingOven = oven;
        RoastingOven roastingOven = oven;

        bakingOven.bakeCookies();
        bakingOven.bakeBread();
        roastingOven.roastChicken();

    }
}
