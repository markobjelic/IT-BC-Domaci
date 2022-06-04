package VikendDomaci;

public class Vozac extends Covek {

    private String zvanje;

    public Vozac(String ime, String prezime, String zvanje) {
        super(ime, prezime);
        this.zvanje = zvanje;
    }

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

}
