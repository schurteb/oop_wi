package ch.teko.oop.tag10.solution.ue_oop_10_02_02;

public interface IService {
    Artikel search(long ean);

    void add(Artikel artikel, String abteilung);
}
