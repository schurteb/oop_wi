package ch.teko.oop.tag08.solution.aufgabe1;

public class Student extends Person {
    private int studentNumber;

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public void writeOutput() {
        System.out.println("Student Number: " + this.getStudentNumber());
        super.writeOutput();
    }
}
