package ch.teko.oop.tag12.solution.ue_oop12_02;

public class KinoTicket extends Ticket {
    private int filmDauer;

    public KinoTicket(Ort eventOrt, String eventName, int basisPreis, int filmDauer) {
        super(eventOrt, eventName, basisPreis);
        this.filmDauer = filmDauer;
    }

    public int getFilmDauer() {
        return filmDauer;
    }

    @Override
    public double berechneTicketPreis() {
        this.setTicketPreis(this.getBasisPreis());

        if (this.getFilmDauer() > 150) {
            this.setTicketPreis(this.getTicketPreis() + 3);
        }
        return this.getTicketPreis();
    }
}
