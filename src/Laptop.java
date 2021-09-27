public class Laptop extends Komponente {

    private double preis;
    private Gehaeuse gehaeuse;
    private Mainboard mainboard;
    private Bildschirm bildschirm;
    private Festplatte festplatte;

    public Laptop(String produktNummer, String hersteller, String modellBezeichnung, double preis, Gehaeuse gehaeuse, Mainboard mainboard, Bildschirm bildschirm, Festplatte festplatte) {
        super(produktNummer, hersteller, modellBezeichnung);
        this.preis = preis;
        this.gehaeuse = gehaeuse;
        this.mainboard = mainboard;
        this.bildschirm = bildschirm;
        this.festplatte = festplatte;
    }




    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "preis=" + preis +
                ", gehaeuse=" + gehaeuse +
                ", mainboard=" + mainboard +
                ", bildschirm=" + bildschirm +
                ", festplatte=" + festplatte +
                '}';
    }
}
