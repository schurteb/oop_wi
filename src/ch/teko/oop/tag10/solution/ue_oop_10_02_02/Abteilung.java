package ch.teko.oop.tag10.solution.ue_oop_10_02_02;

import java.util.HashMap;

public class Abteilung {
    private String name;
    private HashMap<Long, Artikel> arikelListe;

    public Abteilung(String name, HashMap<Long, Artikel> arikelListe) {
        this.name = name;
        this.arikelListe = arikelListe;
    }

    public String getName() {
        return name;
    }

    public HashMap<Long, Artikel> getArikelListe() {
        return arikelListe;
    }

}
