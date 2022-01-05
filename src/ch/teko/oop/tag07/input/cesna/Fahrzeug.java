package ch.teko.oop.tag07.input.cesna;

public abstract class Fahrzeug {
    private Position position;

    public Fahrzeug(Position position) {
        this.position = position;
    }

    //Abtracte Methode
    public abstract void movePosition();

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
