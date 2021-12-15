package ch.teko.oop.probeprüfung.teil1.aufgabe6;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {20, 44, 97, 3, 15};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
