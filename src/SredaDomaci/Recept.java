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

    public Recept() {
        this.nazivRecepta = "";
        this.tezinaRecepta = 1;
        this.kolekcijaSastojaka = new ArrayList<>();
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
                "Tezina: " + tezinaRecepta + '\n' +
                "Sastojci: " + imenaSastojaka;
    }

    public void dodajSastojak(SastojakRecepta sastojakRecepta) {

        this.kolekcijaSastojaka.add(sastojakRecepta);
    }

    public void ukloniSastojak(SastojakRecepta sastojakRecepta) {

        this.kolekcijaSastojaka.remove(sastojakRecepta);
    }
}
