package VikendDomaci;

public class Planina {

    private String ime;
    private String nazivDrzave;
    private double visina;

    public Planina(String ime, String nazivDrzave, double visina) {
        this.ime = ime;
        this.nazivDrzave = nazivDrzave;
        this.visina = visina;
    }

    public Planina() {
        this.ime = "";
        this.nazivDrzave = "";
        this.visina = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }
}
