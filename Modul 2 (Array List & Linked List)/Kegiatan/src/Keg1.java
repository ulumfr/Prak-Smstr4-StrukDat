import java.util.ArrayList;

public class Keg1 {
    public static void main(String[] args) {
        int jumlahBebek = 0;

        ArrayList<String> namaHewan = new ArrayList<>();
        namaHewan.add(0,"Angsa");
        namaHewan.add(1,"Bebek");
        namaHewan.add(2,"Cicak");
        namaHewan.add(3,"Domba");
        namaHewan.add(4,"Elang");
        namaHewan.add(5,"Gajah");
        System.out.println("Output Awal\t\t: " + namaHewan);

        namaHewan.add("Badak");
        namaHewan.add("Bebek");
        System.out.println("\nOutput\t\t\t: " + namaHewan);
        System.out.printf("Posisi Index Bebek\t: ");
        for (int i = 0; i < namaHewan.size(); i++) {
            if (namaHewan.get(i).equals("Bebek")) {
                jumlahBebek++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nJumlah Bebek\t\t: " + jumlahBebek);

        namaHewan.remove(1);
        System.out.println("\nOutput\t\t\t: " + namaHewan);

        System.out.println("\nIndex ke-0\t\t: " + namaHewan.get(0));
        System.out.println("Index ke-2\t\t: " + namaHewan.get(2));
        namaHewan.remove(0);
        System.out.println("Output\t\t\t: " + namaHewan);

        namaHewan.set(0, "Ular");
        System.out.println("\nOutput\t\t\t: " + namaHewan);
        namaHewan.add(2, "Itik");
        System.out.println("Output\t\t\t: " + namaHewan);

        namaHewan.subList(1, 5).clear();
        System.out.println("\nOutput\t\t\t: " + namaHewan);

        System.out.println("\nElemen Pertama\t\t: " + namaHewan.get(0));
        System.out.println("Elemen Yerakhir\t\t: " + namaHewan.get(namaHewan.size() - 1));

        System.out.println("\nJumlah Elemen\t\t: " + namaHewan.size());

        int indexBadak = namaHewan.indexOf("Badak");
        System.out.println("\nIndex Badak\t\t: " + indexBadak);
    }
}
