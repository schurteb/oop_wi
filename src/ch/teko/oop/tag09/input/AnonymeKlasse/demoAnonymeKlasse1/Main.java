package ch.teko.oop.tag09.input.AnonymeKlasse.demoAnonymeKlasse1;

public class Main {
    public static void main(String[] args) {
        // Anonyme Klasse
        new Person("Hans") {
            @Override
            public void printName(){
                System.out.println("Mein Name ist: " + this.getName());
            }
        }.printName();
    }
}
