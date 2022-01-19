package ch.teko.oop.tag09.input.demoZuweisung;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

}
