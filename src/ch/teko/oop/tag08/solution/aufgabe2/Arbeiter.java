package ch.teko.oop.tag08.solution.aufgabe2;

public class Arbeiter extends Mitarbeiter {
    private double stundenLohn;
    private double anzahlStunden;

    public Arbeiter(int persNr, String name, int dienstalter, double stundenLohn, double anzahlStunden) {
        super(persNr, name, dienstalter);
        this.stundenLohn = stundenLohn;
        this.anzahlStunden = anzahlStunden;
    }

    @Override
    public double monatsBrutto() {
        return this.stundenLohn * this.anzahlStunden;
    }
}
