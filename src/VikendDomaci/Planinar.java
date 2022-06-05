package VikendDomaci;

public abstract class Planinar {

    private String ime;
    private String prezime;

    private int ID;
    private static int brojac = 0;

    public void postaviID(){
        brojac++;
        this.ID = brojac;
    }

    public Planinar(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        postaviID();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getID() {
        return ID;
    }

    public abstract void stampaj();

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina nekaPlanina);
}
