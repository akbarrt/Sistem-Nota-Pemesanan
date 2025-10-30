import java.util.*;

public class DiskonOtomatis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Ayam", "Soto Ayam"};
        int[] harga = {20000, 15000, 18000};
        int total = 0;

        System.out.println("=== Menu Restoran ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("Masukkan nomor menu yang ingin dipesan (pisahkan dengan spasi): ");
        String[] pilihan = input.nextLine().split(" ");

        System.out.println("\n=== Nota Pemesanan ===");
        for (String p : pilihan) {
            int index = Integer.parseInt(p) - 1;
            if (index >= 0 && index < menu.length) {
                System.out.println(menu[index] + " - Rp" + harga[index]);
                total += harga[index];
            }
        }

        double diskon = (total > 50000) ? total * 0.1 : 0; // Diskon 10% jika total > 50.000
        double subtotal = total - diskon;
        double pajak = subtotal * 0.1;
        double totalBayar = subtotal + pajak;

        System.out.println("----------------------");
        System.out.println("Subtotal: Rp" + total);
        System.out.println("Diskon 10% (jika total > 50000): Rp" + diskon);
        System.out.println("Pajak 10%: Rp" + pajak);
        System.out.println("Total Bayar: Rp" + totalBayar);
        System.out.println("----------------------");
        System.out.println("Terima kasih telah memesan!");

        input.close();
    }
}