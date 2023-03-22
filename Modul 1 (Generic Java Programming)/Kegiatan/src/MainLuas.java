import java.util.Scanner;

public class MainLuas {
    public static void main(String[] args) {
        menuPilih();
    }
    
    public static void menuPilih() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n========== Menghitung Luas Segitiga ==========");
        System.out.println("\n1. Integer\n2. Double\n3. Keluar\n");
        System.out.print("Masukan Pilihan Anda : ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.print("\nMasukan Nilai Alas & Tinggi (Berurutan) : ");

                Segitiga<Integer> luasTipeInt = new Segitiga<>(input.nextInt(), input.nextInt());

                System.out.println("Hasil Luas Segitiga dalam Integer\t: " + luasTipeInt.getResultAsInt());
                nextPilih();
                break;

            case 2:
                System.out.print("\nMasukan Nilai Alas & Tinggi (Berurutan) : ");

                Segitiga<Double> luasTipeDouble = new Segitiga<>(input.nextDouble(), input.nextDouble());

                System.out.println("Hasil Luas Segitiga dalam Double\t: " + luasTipeDouble.getResultAsDouble());
                nextPilih();
                break;

            case 3:
                System.out.println("\nKeluar Mas");
                System.exit(0);

            default:
                System.out.println("\nMohon Maaf, Pilihan Anda Salah!");
                menuPilih();
        }
        input.close();
    }

    public static void nextPilih() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nLanjut (y/n) ? ");
        char pilih = input.next().charAt(0);

        if (pilih == 'y') {
            menuPilih();
        } else if (pilih == 'n') {
            input.close();
            System.out.println("\nKeluar Mas");
            System.exit(0);
        } else {
            System.out.println("Pilihan Salah, Tolong Input Ulang!");
            nextPilih();
        }
    }
}