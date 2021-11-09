package ch.teko.oop.tag02.input;

public class Mensch {

    // Attribute
    public String name;
    public String vorname;
    public int alter;

    // Default Konstruktor
    public Mensch() {
        //leer
    }

    // Getter & Setter Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public static void main(String[] args) {
        Mensch mensch = new Mensch();
        System.out.printf("%s, %s, %d", mensch.getVorname(), mensch.getName(), mensch.getAlter());
    }
}
