import java.util.Scanner;
import java.util.HashMap;

public class DataPraktikan {
    private HashMap<String, String> tabelData;
    private HashMap<String, String> tabelSesiLogin;

    Scanner input = new Scanner(System.in);
    public DataPraktikan() {
        tabelData = new HashMap<>();
        tabelSesiLogin = new HashMap<>();
    }

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (!nimPraktikan.startsWith("IF") || tabelData.containsKey(nimPraktikan)) {
            System.out.println("\nNIM Praktikan harus 'IF' atau NIM Praktikan sudah terdaftar.");
            return false;
        }
        tabelData.put(nimPraktikan, namaAsisten);
        System.out.println("\nData Berhasil ditambahkan.");
        return true;
    }

    public void tampil() {
        if (tabelData.isEmpty()) {
            System.out.println("\nData Praktikan masih kosong.");
            return;
        } else {
            System.out.println("\n=== Daftar NIM Praktikan dan Nama Asisten ===\n");
            System.out.println("Jumlah " + totalEmail() + " Data Praktikan");
            for (String nimPraktikan : tabelData.keySet()) {
                String namaAsisten = tabelData.get(nimPraktikan);
                System.out.println(nimPraktikan + " --- " + namaAsisten);
            }
        }
    }

    public void listNimPraktikan() {
        if (tabelData.isEmpty()) {
            System.out.println("\nData Praktikan masih kosong.");
            return;
        } else {
            System.out.println("\n\n=== List NIM Praktikan ===");
            for (String nimPraktikan : tabelData.keySet()) {
                System.out.println(nimPraktikan);
            }
        }
    }

    public void listNamaAsisten() {
        if (tabelData.isEmpty()) {
            System.out.println("\nData Praktikan masih kosong.");
            return;
        } else {
            System.out.println("\n\n=== List Nama Asisten ===");
            for (String namaAsisten : tabelData.values()) {
                System.out.println(namaAsisten);
            }
        }
    }

    public int totalEmail() {
        return tabelData.size();
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (!tabelData.get(nimPraktikan).equals(namaAsisten)) {
            System.out.println("\nNama Asisten yang dimasukkan tidak cocok.");
            return false;
        }
        tabelData.remove(nimPraktikan);
        System.out.println("\nData Berhasil dihapus.");
        return true;
    }

    public void editData(String nimPraktikan, String namaAsisten) {
        tabelData.put(nimPraktikan, namaAsisten);
        System.out.println("\nData Nama Asisten Berhasil diubah.");
    }

    public boolean tambahAkun(String emailAkun, String passwordAkun){
        tabelSesiLogin.put(emailAkun, passwordAkun);
        return true;
    }

    public void daftar(){
        System.out.println("\n=== DAFTAR ===");
        System.out.print("Masukan Email\t: ");
        String tmpEmail = input.nextLine();
        System.out.print("Masukan Pass\t: ");
        String tmpPass = input.nextLine();

        if (!tmpEmail.endsWith("@umm.ac.id")) {
            System.out.println("Maaf, hanya email dengan domain \"@umm.ac.id\" yang dapat mendaftar.");
        } else {
            tambahAkun(tmpEmail, tmpPass);
            System.out.println("\nPendaftaran berhasil.");
        }
    }

    public void login(){
        if (tabelSesiLogin.isEmpty()) {
            System.out.println("\nData Akun masih kosong.");
            return;
        }else{
            System.out.println("\n=== LOGIN ===");
            System.out.print("Masukan Email\t: ");
            String tmpEmail = input.nextLine();
            System.out.print("Masukan Pass\t: ");
            String tmpPass = input.nextLine();
    
            if (tabelSesiLogin.containsKey(tmpEmail) && tabelSesiLogin.get(tmpEmail).equals(tmpPass)) {
                if(tmpEmail.endsWith("@umm.ac.id")){
                    dashboard();
                }else{
                    System.out.println("\nGagal Login, Email harus menggunakan domain \"@umm.ac.id\" yang dapat masuk.");
                }
            }else{
                System.out.println("\nGagal Login, Email dan Password salah.");
            }
        }
        
    }

    public void logout(){
        System.out.println("\n\nLogout... Terima kasih...!");
        System.exit(0);
    }
    
    public void awal(){
        boolean logout = false;

        while(!logout){
            System.out.println("\n=== WELCOME MAHASISWA ===");
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("0. Logout");
            System.out.print("\nMasukkan Pilihan : ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 0:
                    logout();
                    break;

                case 1:
                    daftar();
                    break;

                case 2:
                    login();
                    break;
            
                default:
                    System.out.println("\nPilihan Tidak Valid... Silahkan Ulangi Lagi !!!");
            }
        }
    }

    public void dashboard(){
        String nimPraktikan, namaAsisten;

        boolean exit = false;
        while (!exit) {
            System.out.println("\n===========================================");
            System.out.println("==== Modul 4 (HashMap) DataPraktikan ====");
            System.out.println("===========================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Tampilkan NIM Praktikan");
            System.out.println("4. Tampilkan Nama Asisten");
            System.out.println("5. Hapus Data");
            System.out.println("6. Edit Data");
            System.out.println("0. Keluar");
            System.out.print("\nMasukkan Pilihan : ");

            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 0:
                    exit = true;
                    System.out.println("\n\nKeluar... Terima Kasih\n");
                    awal();
                    break;

                case 1:
                    System.out.println("\n=== Tambah Data Baru ===");
                    System.out.print("Masukkan NIM Praktikan\t: ");
                    nimPraktikan = input.nextLine();
                    System.out.print("Masukkan Nama Asisten\t: ");
                    namaAsisten = input.nextLine();
                    tambahData(nimPraktikan, namaAsisten);
                    break;

                case 2:
                    tampil();
                    break;

                case 3:
                    listNimPraktikan();
                    break;

                case 4:
                    listNamaAsisten();
                    break;

                case 5:
                    if (tabelData.isEmpty()){
                        System.out.println("\nData Praktikan masih kosong.");
                    }else{
                        System.out.print("\nMasukkan NIM Praktikan (Hapus)\t: ");
                        nimPraktikan = input.nextLine();
    
                        if (tabelData.containsKey(nimPraktikan)) {
                            System.out.print("Masukkan Nama Asisten (Verif)\t: ");
                            namaAsisten = input.nextLine();
                            hapusData(nimPraktikan, namaAsisten);
                        } else {
                            System.out.println("\nNIM Praktikan tidak ditemukan.");
                        }
                    }
                    break;

                case 6:
                    if (tabelData.isEmpty()){
                        System.out.println("\nData Praktikan masih kosong.");
                    }else{
                        System.out.print("\nMasukkan NIM Praktikan (Edit)\t: ");
                        nimPraktikan = input.nextLine();
    
                        if (tabelData.containsKey(nimPraktikan)) {
                            System.out.print("Masukkan Nama Asisten (BARU)\t: ");
                            namaAsisten = input.nextLine();
                            editData(nimPraktikan, namaAsisten);
                        } else {
                            System.out.println("\nNIM Praktikan tidak ditemukan.");
                        }
                    }
                    break;

                default:
                    System.out.println("\nPilihan Tidak Valid... Silahkan Ulangi Lagi !!!");
            }
        }
    }

    public static void main(String[] args) {
        DataPraktikan data = new DataPraktikan();
        data.awal();
    }
}