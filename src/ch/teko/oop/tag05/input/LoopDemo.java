package ch.teko.oop.tag05.input;

public class LoopDemo {
    public static void main(String[] args) {

        int counter = 0;
        int result = 10;

        while (result > 0) {
            result--;
            counter++;
            System.out.println(counter);
        }

        counter = 0;
        result = 10;
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            result--;
            counter++;
            System.out.println(counter);
        }

    }
}
