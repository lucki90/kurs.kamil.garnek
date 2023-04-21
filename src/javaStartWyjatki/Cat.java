package javaStartWyjatki;

public class Cat extends Animal {

    public void idz(){
        System.out.println("ide sobie");
    }

    @Override
    public void dajGlos() {
        System.out.println("Miau Miau");
    }
}
