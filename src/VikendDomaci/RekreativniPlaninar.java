package VikendDomaci;

public class RekreativniPlaninar extends Planinar{

    private int tezinaOpreme;
    private String nazivOkruga;
    private int maxUspon;

    public RekreativniPlaninar(String ime, String prezime, int tezinaOpreme, String nazivOkruga, int maxUspon) {
        super(ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + getID() + "\n" + "ime: " + getIme() + " " + getPrezime() + "\n" + "Okrug: " + nazivOkruga);
    }

    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina nekaPlanina) {
        if (maxUspon - (tezinaOpreme * 50) > nekaPlanina.getVisina()) {
            return true;
        }
        return false;
    }
}