// Aplikasi Sederhana: Nota Pemesanan Makanan di Restoran

import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
    String nama;
    double harga;

    MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

public class Main {
    static ArrayList<MenuItem> daftarMenu = new ArrayList<>();
    static ArrayList<MenuItem> pesanan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        isiMenu();
        tampilkanMenuUtama();
    }

    static void isiMenu() {
        daftarMenu.add(new MenuItem("Nasi Goreng", 20000));
        daftarMenu.add(new MenuItem("Mie Ayam", 15000));
        daftarMenu.add(new MenuItem("Ayam Bakar", 25000));
        daftarMenu.add(new MenuItem("Soto Ayam", 18000));
        daftarMenu.add(new MenuItem("Es Teh Manis", 5000));
    }

    static void tampilkanMenuUtama() {
        int pilihan;
        do {
            System.out.println("\n=== SISTEM NOTA PEMESANAN MAKANAN ===");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Tambah Pesanan");
            System.out.println("3. Lihat Pesanan");
            System.out.println("4. Cetak Nota");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = ambilAngka();

            switch (pilihan) {
                case 1 -> tampilkanMenu();
                case 2 -> tambahPesanan();
                case 3 -> tampilkanPesanan();
                case 4 -> cetakNota();
                case 5 -> System.out.println("Terima kasih telah menggunakan sistem ini.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tampilkanMenu() {
        System.out.println("\n=== Daftar Menu Restoran ===");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.printf("%d. %s - Rp%.0f\n", i + 1, daftarMenu.get(i).nama, daftarMenu.get(i).harga);
        }
    }

    static void tambahPesanan() {
        tampilkanMenu();
        System.out.print("Pilih nomor menu yang ingin dipesan: ");
        int indeks = ambilAngka() - 1;
        if (indeks >= 0 && indeks < daftarMenu.size()) {
            pesanan.add(daftarMenu.get(indeks));
            System.out.println("Pesanan berhasil ditambahkan!");
        } else {
            System.out.println("Nomor menu tidak valid.");
        }
    }

    static void tampilkanPesanan() {
        if (pesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }
        System.out.println("\n=== Daftar Pesanan Anda ===");
        double total = 0;
        for (int i = 0; i < pesanan.size(); i++) {
            System.out.printf("%d. %s - Rp%.0f\n", i + 1, pesanan.get(i).nama, pesanan.get(i).harga);
            total += pesanan.get(i).harga;
        }
        System.out.printf("Total sementara: Rp%.0f\n", total);
    }

    static void cetakNota() {
        if (pesanan.isEmpty()) {
            System.out.println("Belum ada pesanan yang bisa dicetak.");
            return;
        }
        System.out.println("\n=== NOTA PEMESANAN ===");
        double total = 0;
        for (MenuItem item : pesanan) {
            System.out.printf("- %s : Rp%.0f\n", item.nama, item.harga);
            total += item.harga;
        }

        // Custom Live Template - Rumus Perhitungan Total dengan Pajak 10%
        double pajak = total * 0.10; // pajak 10%
        double totalBayar = total + pajak;

        System.out.println("-----------------------------");
        System.out.printf("Subtotal: Rp%.0f\n", total);
        System.out.printf("Pajak (10%%): Rp%.0f\n", pajak);
        System.out.printf("Total Bayar: Rp%.0f\n", totalBayar);
        System.out.println("-----------------------------");
        System.out.println("Terima kasih telah memesan di restoran kami!");

        pesanan.clear(); // reset pesanan setelah nota dicetak
    }

    static int ambilAngka() {
        while (!input.hasNextInt()) {
            System.out.print("Masukkan angka yang valid: ");
            input.next();
        }
        int angka = input.nextInt();
        input.nextLine();
        return angka;
    }
}