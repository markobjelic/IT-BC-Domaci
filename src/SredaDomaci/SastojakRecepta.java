package SredaDomaci;

public class SastojakRecepta extends Sastojak {

    private double kolicina;

    public SastojakRecepta(String naziv, double cena, double kolicina) {
        super(naziv, cena);
        this.kolicina = kolicina;
    }

    public SastojakRecepta() {
        super();
        this.kolicina = 0;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "SastojakRecepta{" +
                "naziv=" + this.getNaziv() + ", " +
                "cena=" + this.getCena() + ", " +
                "kolicina=" + kolicina +
                '}';
    }

    public double ukupnaCena(){
        double rez = 0;
        rez = this.getKolicina() * this.getCena();
        return rez;
    }

}
