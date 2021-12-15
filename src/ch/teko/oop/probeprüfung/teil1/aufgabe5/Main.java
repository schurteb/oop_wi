package ch.teko.oop.probeprüfung.teil1.aufgabe5;

public class Main {
    public static void main(String[] args) {
        int i = 7;
        float f = 4.0f;
        short s = 21;

        // 1.
        float r1 = 7 / f + i;
        System.out.println(r1);

        // 2.
        double r2 = f + 1.0 * i;
        System.out.println(r2);

        // 3.
        int r3 = ((int)(9.9f - 1)) % 4;
        System.out.println(r3);

        // 4.
        int r4 = s / i;
        System.out.println(r4);
    }
}
