package ch.teko.oop.tag09.input.demoInterface2;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Kreis1", 5);
        System.out.printf("%s in %s hat die Fläche: %f", circle1.getName(), circle1.getColor(), circle1.calculateArea());
    }
}
