package ch.teko.oop.tag05.input.bus;

public class Bus {
    // Bus hat ein Attribut vom Typ Array. Das Array enthält Objekte des Typ's Person
    private Person[] sitzPlaetze;

    public Bus(int anzahlPlaetze) {
        this.sitzPlaetze = new Person[anzahlPlaetze];
    }

    public void setSitzPlatz(int sitzPlatz, Person person) {
        this.sitzPlaetze[sitzPlatz] = person;
    }

    public Person[] getSitzPlaetze() {
        return sitzPlaetze;
    }
}
