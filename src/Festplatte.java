public class Festplatte extends Komponente{

    private Lesekopf lesekopf;
    private Schreibkopf schreibkopf;



    public Festplatte(String produktNummer, String hersteller, String modellBezeichnung) {
        super(produktNummer, hersteller, modellBezeichnung);

        this.schreibkopf = new Schreibkopf();
        this.lesekopf = new Lesekopf();
    }

    @Override
    public String toString() {
        return "Festplatte{" +
                "lesekopf=" + lesekopf +
                ", schreibkopf=" + schreibkopf +
                '}';
    }
}
