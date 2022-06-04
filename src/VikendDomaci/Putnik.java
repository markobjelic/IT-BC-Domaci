package VikendDomaci;

public class Putnik extends Covek {

    private double novac;

    public Putnik(String ime, String prezime, double novac) {
        super(ime, prezime);
        this.novac = novac;
    }

    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }
    public void dodajNovac(double dodatNovac) {
        this.novac += dodatNovac;
    }
    public void oduzmiNovac(double oduzetNovac) {
        this.novac -= oduzetNovac;
    }
}
