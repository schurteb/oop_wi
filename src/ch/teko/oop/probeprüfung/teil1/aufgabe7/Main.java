package ch.teko.oop.probeprüfung.teil1.aufgabe7;

public class Main {
    public static void main(String[] args) {
        // while-loop
        int i = 0;
        while (i < 5) {
            System.out.println();
            int a = 0;
            while (a < i) {
                System.out.print("*");
                a++;
            }
            i++;
        }

        // for-loop
        for (i = 0; i < 5; i++) {
            System.out.println();
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
        }
    }
}
