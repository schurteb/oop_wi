package ch.teko.oop.tag09.input.demoInterface2;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }
}
