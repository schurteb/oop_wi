package ch.teko.oop.tag02.input;

public class Main {
    public static void main(String[] args) {
        // Startwerte
        int i = 7;
        float f = 4.0f;
        short s = 21;

        // 1.
        float res = 7 / f + i;
        System.out.println(res);

        // 2.
        double res2 = f + 1.0 * i;
        System.out.println(res2);

        // 3.
        int res3 = ((int)(9.9f - 1)) %4;
        System.out.println(res3);

        // 4.
        int res4 = s / i;
        System.out.println(res4);

        // 5.
        byte b1 = 127;
        byte b2 = 1;
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);
    }
}
