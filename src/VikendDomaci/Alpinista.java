package VikendDomaci;

public class Alpinista extends Planinar {

    private int brojPoena;

    public Alpinista(String ime, String prezime, int brojPoena) {
        super(ime, prezime);
        this.brojPoena = brojPoena;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + getID() + "\n" + "ime: " + getIme() + " " + getPrezime() + "\n" + "Broj poena: " + brojPoena);
    }

    @Override
    public double clanarina() {
        return 1500 - (brojPoena * 50);
    }

    @Override
    public boolean uspesanUspon(Planina nekaPlanina) {
        if (nekaPlanina.getVisina() < 4000) {
            return true;
        }
        return false;
    }
}
