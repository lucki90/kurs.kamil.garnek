package samoczuekEqualsHashCode;

public class Main {
    public static void main(String[] args)  {
        Human human = new Human("dsad", null, "asdasfd");

        try {
            human.zwrocPierwszaLittereNazwiska();

        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
            System.out.println("Spoko nie ma problemu, znam ten blad, masz puste naziwsko");
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Chuj wie co sie stalo... nie znam tego bledu");
        }
    }
}
