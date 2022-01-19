package ch.teko.oop.tag09.input.demoInterface2;

public abstract class Shape implements IArithmeticOperation {
    private Color color;
    private String name;

    public Shape(String name) {
        Color[] colors = Color.values();
        int randomColor = (int) (Math.random() * Color.values().length);
        this.color = colors[randomColor];
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
