package VikendDomaci;

import java.util.ArrayList;

public class TestPlaninar {
    public static void main(String[] args) {

        Planina planina = new Planina("Zlatibor", "SRB", 1500);

        RekreativniPlaninar prviR = new RekreativniPlaninar("pera", "peric", 5, "UE", 1550);
        RekreativniPlaninar drugiR = new RekreativniPlaninar("laza", "lazic", 4, "KG", 1800);
        RekreativniPlaninar treciR = new RekreativniPlaninar("mika", "mikic", 10, "BG", 2000);

        Alpinista prviA = new Alpinista("marija", "maric", 2);
        Alpinista drugiA = new Alpinista("milica", "milic", 3);
        Alpinista treciA = new Alpinista("ana", "stanic", 1);

        ArrayList<Planinar> listaPlaninara = new ArrayList<>();
        listaPlaninara.add(prviR);
        listaPlaninara.add(drugiR);
        listaPlaninara.add(treciR);
        listaPlaninara.add(prviA);
        listaPlaninara.add(drugiA);
        listaPlaninara.add(treciA);

        double sum = 0;

        for (Planinar trenutniPlaninar : listaPlaninara) {
            trenutniPlaninar.stampaj();
            System.out.println("da li ce se " + trenutniPlaninar.getIme() + " popeti na instanciranu planinu: " + trenutniPlaninar.uspesanUspon(planina));
            sum += trenutniPlaninar.clanarina();
        }
        System.out.println("\nUkupna clanarina svih planinara je: " + sum + " RSD");
    }
}