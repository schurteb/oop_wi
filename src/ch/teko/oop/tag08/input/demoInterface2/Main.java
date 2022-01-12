package ch.teko.oop.tag08.input.demoInterface2;

public class Main {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.printSomehting();

        //Zugriff auf die statische Variable des Interfaces
        System.out.println(IShape.var);
    }

}
