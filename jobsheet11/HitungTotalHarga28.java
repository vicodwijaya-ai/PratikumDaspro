package jobsheet11;

import java.util.Scanner;

public class HitungTotalHarga28 {

    public static void Menu(String namaPelangan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelangan);

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang Anda inginkan");

    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat Anda mendapatkan diskon 50%");
            hargaTotal = (int) (hargaTotal * 0.5);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat Anda mendapatkan dikson 30%");
            hargaTotal = (int) (hargaTotal * 0.7);
        } else {
            System.out.println("Kode promo invalid");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalKeseluruhan = 0;
        String lanjut = "y";

        while (lanjut.equalsIgnoreCase("y")) {

            Menu("Andi", false, "");

            System.out.print("\nMasukan nomer menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukan jumblah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();

            System.out.print("Masukan kode promo (tekan enter jika tidak ada): ");
            String kodePromo = sc.nextLine();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

            totalKeseluruhan += totalHarga;

            System.out.print("Apakah ingin memesan menu lain? (y/t): ");
            lanjut = sc.nextLine();
        }

        System.out.println("-----------------------------------");
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalKeseluruhan);
    }
}
