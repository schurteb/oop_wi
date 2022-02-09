package ch.teko.oop.tag12.input.ue_oop12_03;

public class Schulklasse implements IStatistik {
    private double[] noten;

    public Schulklasse(double[] noten) {
        this.noten = noten;
    }

    @Override
    public double median() {
        return 0;
    }

    @Override
    public double mittelwert() {
        return 0;
    }
}
