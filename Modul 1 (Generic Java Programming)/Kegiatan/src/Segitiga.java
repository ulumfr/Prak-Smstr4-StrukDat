import java.util.Scanner;

public class Segitiga<T extends Number> {
    private T alas;
    private T tinggi;

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luasSegitiga(String tipeSegitiga) {
        double alasSegitiga = alas.doubleValue();
        double tinggiSegitiga = tinggi.doubleValue();

        if (tipeSegitiga.equalsIgnoreCase("double")) {
            return 0.5 * alasSegitiga * tinggiSegitiga;
        } else if (tipeSegitiga.equalsIgnoreCase("int")) {
            return (int) (0.5 * alasSegitiga * tinggiSegitiga);
        } else {
            throw new IllegalArgumentException("Tipe Luas Segitiga Tidak Valid!");
        }
    }
    
    public double getResultAsDouble() {
        return luasSegitiga("double");
    }

    public int getResultAsInt() {
        return (int) luasSegitiga("int");
    }

    public static void menuPilih() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n========== Menghitung Luas Segitiga ==========");
            System.out.println("\n1. Integer\n2. Double\n3. Keluar\n");
            System.out.print("Masukan Pilihan Anda : ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("\nNilai Alas & Tinggi (Berurutan) : ");
                    int alasInt = input.nextInt();
                    int tinggiInt = input.nextInt();

                    Segitiga<Integer> luasTipeInt = new Segitiga<>(alasInt, tinggiInt);

                    System.out.println("Luas Segitiga dalam Integer\t:" + luasTipeInt.getResultAsInt());
                    nextPilih(); break;

                case 2:
                    System.out.print("\nNilai Alas & Tinggi (Berurutan) : ");
                    double alasDouble = input.nextDouble();
                    double tinggiDouble = input.nextDouble();

                    Segitiga<Double> luasTipeDouble = new Segitiga<>(alasDouble, tinggiDouble);

                    System.out.println("Luas Segitiga dalam Double\t: " + luasTipeDouble.getResultAsDouble());
                    nextPilih(); break;

                case 3:
                    System.out.println("\nKeluar Makaseh");
                    System.exit(0); break;

                default:
                    System.out.println("\nMohon Maaf Pilihan Anda Salah!\n");
                    menuPilih();
            }
        } catch (Exception e) {
            System.out.println("\nMohon Maaf Input Anda Tidak Valid!");
            menuPilih();
        }
    }

    public static void nextPilih() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nLanjut (y/n) ? ");
        char pilih = input.next().charAt(0);

        if (pilih == 'y') {
            menuPilih();
        } else if (pilih == 'n') {
            input.close();
            System.exit(0);
        } else {
            System.out.println("Pilihan Salah, Ulang!");
            nextPilih();
        }
    }

    public static void main(String[] args) {
        menuPilih();
    }
}
