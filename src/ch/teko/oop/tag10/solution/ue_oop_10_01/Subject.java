package ch.teko.oop.tag10.solution.ue_oop_10_01;

import java.util.HashMap;

public class Subject {
    private HashMap<String, Book> bookHashMap;

    public Subject(HashMap<String, Book> bookHashMap) {
        this.bookHashMap = bookHashMap;
    }

    public HashMap<String, Book> getBookHashMap() {
        return bookHashMap;
    }
}
