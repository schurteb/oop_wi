package ch.teko.oop.tag12.input.ue_oop12_02;

public class SportTicket extends Ticket {
    private int pokalStufe;

    public SportTicket(Ort eventOrt, String eventName, int basisPreis, int pokalStufe) {
        super(eventOrt, eventName, basisPreis);
        this.pokalStufe = pokalStufe;
    }

    public int getPokalStufe() {
        return pokalStufe;
    }

    @Override
    public double berechneTicketPreis() {
        this.setTicketPreis(this.getBasisPreis() + (10 * this.getPokalStufe()));
        return this.getTicketPreis();
    }
}
