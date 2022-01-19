package ch.teko.oop.tag09.input.demoInterface2;

public class Circle extends Shape {
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
