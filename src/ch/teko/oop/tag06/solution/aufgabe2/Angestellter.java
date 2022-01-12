package ch.teko.oop.tag06.solution.aufgabe2;

public class Angestellter extends Person {
    private String mitarbeiterID;

    public Angestellter(String nachname, String vorname, int alter, String mitarbeiterID) {
        super(nachname, vorname);
        super.alter = alter;
        this.mitarbeiterID = mitarbeiterID;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("MitarbeiterID: " + this.mitarbeiterID);
    }
}
