package ch.teko.oop.tag12.solution.ue_oop12_01;

public class Buergerort {
    private String name;
    private Nation nation;

    public Buergerort(String name, Nation nation) {
        this.name = name;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public Nation getNation() {
        return nation;
    }
}
