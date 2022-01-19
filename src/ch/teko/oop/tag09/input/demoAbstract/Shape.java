package ch.teko.oop.tag09.input.demoAbstract;

public abstract class Shape {
    private Color color;
    private String name;

    public Shape(String name) {
        Color[] colors = Color.values();
        int randomColor = (int) (Math.random() * Color.values().length);
        this.color = colors[randomColor];
        this.name = name;
    }

    public abstract double calculateArea();

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
