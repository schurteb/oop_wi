package ch.teko.oop.tag01.input;

public class Auto {
    //Attribute
    private String name;
    private String farbe;
    private int ps;

    /**
     * Konstruktor initialisiert Attribute.
     * @param name
     * @param farbe
     * @param ps
     */
    public Auto(String name, String farbe, int ps) {
        this.name = name;
        this.farbe = farbe;
        this.ps = ps;
    }

    //Default Konstruktor (implizit)
    public Auto() {
    }

    //Getter und Setter Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
