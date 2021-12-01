package ch.teko.oop.tag05.input.bus;

public class Person {
    private String name;
    private String vorName;

    public Person(String name, String vorName) {
        this.name = name;
        this.vorName = vorName;
    }

    public String getName() {
        return name;
    }

    public String getVorName() {
        return vorName;
    }
}
