public class Mainboard extends Komponente {

    private int steckplaetze;
    private Prozessor prozessor;
    private Ram ram;


    @Override
    public String toString() {
        return "Mainboard{" +
                "steckplaetze=" + steckplaetze +
                ", prozessor=" + prozessor +
                ", ram=" + ram +
                '}';
    }

    public Mainboard(String produktNummer, String hersteller, String modellBezeichnung, int steckplaetze, Prozessor prozessor, Ram ram) {
        super(produktNummer,hersteller,modellBezeichnung);

        this.steckplaetze = steckplaetze;
        this.prozessor = prozessor;
        this.ram = ram;


    }

    public int getSteckplaetze() {
        return steckplaetze;
    }

    public void setSteckplaetze(int steckplaetze) {
        this.steckplaetze = steckplaetze;
    }


}
