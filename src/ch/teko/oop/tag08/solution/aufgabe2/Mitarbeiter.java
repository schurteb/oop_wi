package ch.teko.oop.tag08.solution.aufgabe2;

public abstract class Mitarbeiter {
    private int persNr;
    private String name;
    private int dienstalter;

    public Mitarbeiter(int persNr, String name, int dienstalter) {
        this.persNr = persNr;
        this.name = name;
        this.dienstalter = dienstalter;
    }

    public int getPersNr() {
        return persNr;
    }

    public String getName() {
        return name;
    }

    public int getDienstalter() {
        return dienstalter;
    }

    public abstract double monatsBrutto();
}
