package ch.teko.oop.tag03.input;

import java.util.Scanner;

public class Ascii {

    public Scanner scanner;

    public Ascii() {
        this.scanner = new Scanner(System.in);
    }

    public int readIntegerFromCommandLine() {
        return this.scanner.nextInt();
    }

    public short readShortFromCommandLine() {
        return this.scanner.nextShort();
    }

    public static void main(String[] args) {
        Ascii ascii1 = new Ascii();
        char c1 = (char) ascii1.readIntegerFromCommandLine();
        System.out.println(c1);

        Ascii ascii2 = new Ascii();
        char c2 = (char) ascii2.readShortFromCommandLine();
        System.out.println(c2);
    }

}
