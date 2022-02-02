package ch.teko.oop.tag11.input.ue_arrayList_01;

public class CrewMember {
    private String name;
    private Profession profession;

    public CrewMember(String name, Profession profession) {
        this.name = name;
        this.profession = profession;
    }

    public Profession getProfession() {
        return profession;
    }
}
