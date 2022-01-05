package ch.teko.oop.tag07.input.konto;

public class Main {

    public static void main(String[] args) {
        Konto k = new Konto(1000.0, 0.05);
        Konto k1 = new Girokonto(10000.0, 0.0);
        Konto k2 = new Sparkonto(20000.0, 0.5);

        k.print();
        k1.print();
        k2.print();

    }
}
