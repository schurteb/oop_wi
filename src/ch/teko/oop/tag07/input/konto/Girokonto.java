package ch.teko.oop.tag07.input.konto;

public class Girokonto extends Konto {
    private double creditLimit;
    private double creditRate;

    public Girokonto(double saldo, double rate) {
        super(saldo, rate);
        this.creditLimit = -1000.0;
        this.creditRate = 10.0;
    }

    @Override
    public void print() {
        System.out.println("Kreditlimite: " + this.creditLimit);
        super.print();
    }

    @Override
    public void payIn(double value) {
        super.payIn(value);
    }

}
