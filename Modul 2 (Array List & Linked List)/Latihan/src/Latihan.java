import java.util.ArrayList;

public class Latihan {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan\t\t\t: " + Hewan);
       
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        Hewan.removeAll(DeleteHewan);
        System.out.println("Hewan yang dihapus\t: " + DeleteHewan);
        System.out.println("Output Hewan\t\t: " + Hewan);
    }
}