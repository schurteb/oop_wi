package ch.teko.oop.tag03.solution.calculator;

import java.util.Scanner;

public class Input {

    // Attribute
    private Scanner myScanner;

    // Konstruktor
    public Input() {
        this.myScanner = new Scanner(System.in);
    }

    // Methoden
    public int readIntFromCommandLine() {
        return this.myScanner.nextInt();
    }
}
