package VikendDomaci;

import java.util.ArrayList;

public class Autobus {

    private String naziv;
    private Vozac vozac;
    private double cenaKarte;
    private ArrayList<Putnik> putnici;

    public Autobus(String naziv, Vozac vozac, double cenaKarte, ArrayList<Putnik> putnici) {
        this.naziv = naziv;
        this.vozac = vozac;
        this.cenaKarte = cenaKarte;
        this.putnici = putnici;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Vozac getVozac() {
        return vozac;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }

    public double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public ArrayList<Putnik> getPutnici() {
        return putnici;
    }

    public void setPutnici(ArrayList<Putnik> putnici) {
        this.putnici = putnici;
    }
///////////////////////////////////////////////////////////////
    public void dodajVozaca(Vozac dodatiVozac) {
        this.vozac = dodatiVozac;
    }
    public void oduzmiVozaca() {
        this.vozac = null;
    }

    public void dodajPutnika(Putnik dodatiPutnik) {
        putnici.add(dodatiPutnik);
    }
    public void oduzmiPutnika(Putnik oduzetiPutnik) {
        putnici.remove(oduzetiPutnik);
    }
}
