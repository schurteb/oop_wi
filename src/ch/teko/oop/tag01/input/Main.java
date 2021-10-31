package ch.teko.oop.tag01.input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Erstellen eines Objektes mit Aufruf des "Default"-Konstruktors
        Auto auto1 = new Auto();
        System.out.printf("Ausgabe Objekt 'auto1': %s, %s, %d", auto1.getName(), auto1.getFarbe(), auto1.getPs());

        System.out.println("\n");

        //Erstellen eines Objektes mit Aufruf des parametrisierten Konstruktors
        Auto auto2 = new Auto("Audi", "Rot", 120);
        System.out.println("Ausgabe Objekt 'auto2': " + auto2.getName() + "; " + auto2.getFarbe() + "; " + auto2.getPs());
    }
}
