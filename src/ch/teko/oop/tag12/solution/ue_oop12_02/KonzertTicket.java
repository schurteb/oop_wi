package ch.teko.oop.tag12.solution.ue_oop12_02;

public class KonzertTicket extends Ticket {
    private int sitzReihe;

    public KonzertTicket(Ort eventOrt, String eventName, int basisPreis, int sitzReihe) {
        super(eventOrt, eventName, basisPreis);
        this.sitzReihe = sitzReihe;
    }

    public int getSitzReihe() {
        return sitzReihe;
    }

    @Override
    public double berechneTicketPreis() {
        this.setTicketPreis(this.getBasisPreis() * (1.0 + 1.0 / this.getSitzReihe()));
        return this.getTicketPreis();
    }
}
