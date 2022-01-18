package ch.teko.oop.tag08.solution.aufgabe1;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeOutput() {
        System.out.println("Name: " + this.getName());
    }
}
