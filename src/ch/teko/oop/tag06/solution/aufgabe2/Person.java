package ch.teko.oop.tag06.solution.aufgabe2;

public class Person {
    private String nachname;
    private String vorname;
    public int alter;

    public Person(final String nachname, final String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }


    public Person() {
        this("Hans", "Peter");
        this.alter = 20;
    }


    public void printInformation() {
        System.out.printf("Nachname: %s, Vorname: %s, Alter: %d", this.nachname, this.vorname, this.alter);
    }
}
