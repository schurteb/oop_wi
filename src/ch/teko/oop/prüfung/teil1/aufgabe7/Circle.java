package ch.teko.oop.prüfung.aufgabe7;

public class Circle {
    private String name;
    private int xPosition;
    private int yPosition;
    private double radius;

    public Circle(String name, int xPosition, int yPosition, double radius) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.radius = radius;
    }

    public Circle(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return this.radius * this.radius * Math.PI;
    }
}
