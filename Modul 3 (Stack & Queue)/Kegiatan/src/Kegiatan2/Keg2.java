package Kegiatan2;

import java.util.Scanner;

public class Keg2 {
    public static void main(String[] args) {
        Queue cuciMotor = new Queue();
        Scanner input = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n===========================================");
            System.out.println("*note : baru merintis usaha (minim karyawan)\n");
            System.out.println("==== Kegiatan 2 (Queue) Cuci Motor ====\n");

            System.out.println("1. Masukan Motor (enqueue)");
            System.out.println("2. Cuci Motor (dequeue)");
            System.out.println("3. Antrian Cuci Motor Pertama (peek)");
            System.out.println("4. Cek Antrian (isEmpty)");
            System.out.println("5. Total Antrian Cuci Motor (size)");
            System.out.println("6. Keluar");

            System.out.print("\nMasukkan Pilihan : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("\nMasukkan Nomor Plat Motor : ");
                    input.nextLine();

                    String nomorPlat = input.nextLine();

                    cuciMotor.enqueue(nomorPlat);
                    System.out.println("\nMotor dengan Plat (" + nomorPlat + ") Telah ditambahkan ke Antrian Cuci...");
                    break;

                case 2:
                    if (cuciMotor.isEmpty()) {
                        System.out.println("\nAntrian Cuci Kosong. Tidak Ada Motor yang dicuci.");
                    } else {
                        String motorDone = cuciMotor.peek();

                        cuciMotor.dequeue();
                        System.out.println("\nMotor dengan Plat (" + motorDone + ") telah dicuci.");
                    }
                    break;

                case 3:
                    if (cuciMotor.isEmpty()) {
                        System.out.println("\nAntrian Cuci Kosong, Silahkan Masuk...");
                    } else {
                        System.out.println("\nAntrian Cuci Pertama dengan Plat (" + cuciMotor.peek() + ") ");
                    }
                    break;

                case 4:
                    if (cuciMotor.isEmpty()) {
                        System.out.println("\nAntrian Cuci Kosong, Silahkan Masuk...");
                    } else {
                        System.out.println("\nAntrian Cuci Full !!!");
                    }
                    break;

                case 5:
                    System.out.println("\nTotal Antrian Cuci " + cuciMotor.size() + " Sepeda Motor");
                    break;

                case 6:
                    exit = true;
                    System.out.println("\nTerima Kasih Sudah Memakai Jasa Kami, Hati - Hati di Jalan...\n\n");
                    input.close();
                    break;

                default:
                    System.out.println("\nPilihan Tidak Valid. Silahkan Ulangi Lagi !!!");
            }
        }
    }
}
