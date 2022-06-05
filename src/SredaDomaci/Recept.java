package SredaDomaci;

import java.util.ArrayList;

public class Recept {
    private String nazivRecepta;
    private int tezinaRecepta;
    private ArrayList<SastojakRecepta> kolekcijaSastojaka;

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

    public int getTezinaRecepta() {
        return tezinaRecepta;
    }

    public void setTezinaRecepta(int tezinaRecepta) {
        this.tezinaRecepta = tezinaRecepta;
    }

    public ArrayList<SastojakRecepta> getKolekcijaSastojaka() {
        return kolekcijaSastojaka;
    }

    public void setKolekcijaSastojaka(ArrayList<SastojakRecepta> kolekcijaSastojaka) {
        this.kolekcijaSastojaka = kolekcijaSastojaka;
    }

    public Recept(String nazivRecepta, int tezinaRecepta, ArrayList<SastojakRecepta> kolekcijaSastojaka) {
        this.nazivRecepta = nazivRecepta;
        this.tezinaRecepta = tezinaRecepta;
        this.kolekcijaSastojaka = kolekcijaSastojaka;
    }

    // konstruktor kopije --->
    public Recept(Recept recept) {
        this.nazivRecepta = recept.getNazivRecepta();
        this.tezinaRecepta = recept.getTezinaRecepta();
        this.kolekcijaSastojaka = recept.getKolekcijaSastojaka();
    }

    public Recept() {
        this.nazivRecepta = "";
        this.tezinaRecepta = 1;
        this.kolekcijaSastojaka = new ArrayList<>();
    }

    public String vracaNivo(int x) {
        String rez = "";
        if (x == 1) {
            rez += "Pocetni";
        } else if (x == 2) {
            rez += "Lak";
        } else if (x == 3) {
            rez = "Srednji";
        } else if (x == 4) {
            rez = "Tezak";
        } else if (x == 5) {
            rez = "Majstorski";
        } else {
            rez = "Pogresan broj. Unesite broj od 1 do 5";
        }
        return rez;
    }

    @Override
    public String toString() {
        String imenaSastojaka = "";
        for (SastojakRecepta sastojakRecepta : kolekcijaSastojaka) {
            imenaSastojaka += sastojakRecepta.getNaziv() + ", ";
        }

//        for (int i = 0; i < kolekcijaSastojaka.size(); i++) {
//             imenaSastojaka += kolekcijaSastojaka.get(i).getNaziv();
//        }

        return nazivRecepta + ":" + '\n' +
                "Tezina: " + vracaNivo(tezinaRecepta) + '\n' +
                "Sastojci: " + imenaSastojaka;
    }

    public void dodajSastojak(SastojakRecepta sastojakRecepta) {

        this.kolekcijaSastojaka.add(sastojakRecepta);
    }

    public void ukloniSastojak(SastojakRecepta sastojakRecepta) {

        this.kolekcijaSastojaka.remove(sastojakRecepta);
    }

    public double ukupnaCenaRecepta() {
        double rez = 0;

        for (SastojakRecepta trenutniSastojak : kolekcijaSastojaka) {
            rez += trenutniSastojak.ukupnaCena();
        }

        return rez;
    }

    public Recept skaliran(Recept receptZaSkaliranje, double skala) {
//        -kopiranje Recepta polje po polje po ugledu na prvi konstruktor:
//        Recept skaliranRecept = new Recept(receptZaSkaliranje.getNazivRecepta(), receptZaSkaliranje.getTezinaRecepta(), receptZaSkaliranje.getKolekcijaSastojaka());

//        koristim konstruktor kopije (treci konstruktor) za pravljenje novog recepta:
        Recept skaliranRecept = new Recept(receptZaSkaliranje);

//        -kad se pravi prazan Recept iznad:
//        skaliranRecept.nazivRecepta = receptZaSkaliranje.nazivRecepta; // ovo ne moze jer su private pa mora set/get
//        -dakle, mora ovako:
//        skaliranRecept.setNazivRecepta(receptZaSkaliranje.getNazivRecepta());
//        skaliranRecept.setTezinaRecepta(receptZaSkaliranje.getTezinaRecepta());
//        skaliranRecept.setKolekcijaSastojaka(receptZaSkaliranje.getKolekcijaSastojaka());

//        I nacin:
//        for (SastojakRecepta trenutniSastojakRecepta : skaliranRecept.kolekcijaSastojaka) {
//            trenutniSastojakRecepta.setKolicina(skala / 100 * trenutniSastojakRecepta.getKolicina());
//        }

//        II nacin:
        for (int i = 0; i < skaliranRecept.kolekcijaSastojaka.size(); i++) {
            skaliranRecept.kolekcijaSastojaka.get(i).setKolicina(skala / 100 * skaliranRecept.kolekcijaSastojaka.get(i).getKolicina());
        }

        return skaliranRecept;
    }

}