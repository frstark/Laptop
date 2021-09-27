public class Gehaeuse extends Komponente {




    private String farbe;
    private String material;
    private double breite;
    private double hoehe;
    private double tiefe;

    public Gehaeuse(String produktNummer, String hersteller, String modellBezeichnung, String farbe, String material, double breite, double hoehe, double tiefe) {

        super(produktNummer,hersteller,modellBezeichnung);

        this.farbe = farbe;
        this.material = material;
        this.breite = breite;
        this.hoehe = hoehe;
        this.tiefe = tiefe;
    }


    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getTiefe() {
        return tiefe;
    }

    public void setTiefe(double tiefe) {
        this.tiefe = tiefe;
    }

    @Override
    public String toString() {
        return "Gehaeuse{" +
                "farbe='" + farbe + '\'' +
                ", material='" + material + '\'' +
                ", breite=" + breite +
                ", hoehe=" + hoehe +
                ", tiefe=" + tiefe +
                '}';
    }
}
