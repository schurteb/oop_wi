package ch.teko.oop.tag09.input.demoInterface1;


public class Circle implements IArithmeticOperation {
    private int radius;
    private String name;
    private Color color;

    enum Color {RED, GREEN, BLUE}

    public Circle(String name, int radius) {
        Color[] colors = Color.values();
        int randomColor = (int) (Math.random() * Color.values().length);
        this.color = colors[randomColor];
        this.radius = radius;
        this.name = name;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }

    public int getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
