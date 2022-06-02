package SredaDomaci;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sastojak sastojak = new Sastojak("Jaje", 12.5);
        System.out.println(sastojak);

        SastojakRecepta sastojakRecepta = new SastojakRecepta("Brasno", 0.075, 300.0);
        System.out.println(sastojakRecepta);

        System.out.println(sastojakRecepta.ukupnaCena());

        SastojakRecepta jaje = new SastojakRecepta("Jaje", 5, 10);
        SastojakRecepta brasno = new SastojakRecepta("Brasno", 67, 100.0);
        SastojakRecepta secer = new SastojakRecepta("Secer", 89, 0.5);

        Recept recept = new Recept("Puslice", 2, new ArrayList<>());
        recept.dodajSastojak(jaje);
        recept.dodajSastojak(brasno);
        recept.dodajSastojak(secer);

        System.out.println(recept);
    }
}