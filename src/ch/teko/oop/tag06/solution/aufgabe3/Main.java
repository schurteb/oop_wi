package ch.teko.oop.tag06.solution.aufgabe3;

public class Main {
    public static void main(String[] args) {
        Lehrling lehrling = new Lehrling("Meier", "Peter", 15, 1000, 5, 123);
        System.out.println("Hallo " + lehrling.getVorname() + " deine MitarbeiterID ist " + lehrling.getMitarbeiterID());
    }
}
