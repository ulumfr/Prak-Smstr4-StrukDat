import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        // Konsumsi untuk Breakfast
        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        // Konsumsi untuk Lunch
        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKonsumsi(nasi, air);
        listKonsumsi.add(lunch);

        // Menu Konsumsi
        System.out.println("Menu Konsumsi\n");
        for (Konsumsi<Makanan, Minuman> konsumsi : listKonsumsi) {
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.diSantap());
            System.out.println(minuman.diSantap());
        }
    }
}
