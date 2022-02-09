package ch.teko.oop.tag12.solution.ue_oop12_04;

public class Parkhaus {
    private String name;
    private Etage[] etagen;

    public Parkhaus(final String name, final Etage[] etagen) {
        this.name = name;
        this.etagen = etagen;
    }

    public String getName() {
        return name;
    }

    public Etage[] getEtagen() {
        return etagen;
    }

}
