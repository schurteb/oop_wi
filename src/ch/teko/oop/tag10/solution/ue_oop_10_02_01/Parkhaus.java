package ch.teko.oop.tag10.solution.ue_oop_10_02_01;

import java.util.ArrayList;

public class Parkhaus {
    private ArrayList<Parkplatz> parkplaetze;

    public Parkhaus(ArrayList<Parkplatz> parkplaetze) {
        this.parkplaetze = parkplaetze;
    }

    public ArrayList<Parkplatz> getParkplaetze() {
        return parkplaetze;
    }

}
