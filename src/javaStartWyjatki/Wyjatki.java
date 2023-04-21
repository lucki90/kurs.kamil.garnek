package javaStartWyjatki;

public class Wyjatki {
    public static void main(String[] args) {

        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez 0");
        }

    }

    private static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}