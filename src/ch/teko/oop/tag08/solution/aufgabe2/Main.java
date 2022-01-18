package ch.teko.oop.tag08.solution.aufgabe2;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter ma1 = new Angestellter(1234,"Hans Peter", 10, 1500.0,100.0);
        System.out.println(ma1.monatsBrutto());
    }
}
