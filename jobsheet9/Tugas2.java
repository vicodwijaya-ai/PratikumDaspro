
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan yang ingin dimasukkan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); // Penting: Konsumsi sisa karakter newline setelah nextInt()

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        System.out.println("\n--- Silakan Masukkan Detail Pesanan ---");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));

            // Meminta nama makanan/minuman
            System.out.print("  Nama Makanan/Minuman: ");
            namaPesanan[i] = sc.nextLine();

            // Meminta harga
            System.out.print("  Harga: Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); // Konsumsi newline setelah nextDouble()
        }

        // Menghitung total biaya
        double totalBiaya = 0;
        for (int i = 0; i < hargaPesanan.length; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\n==================================");
        System.out.println("      DAFTAR PESANAN ANDA");
        System.out.println("==================================");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("----------------------------------");

        System.out.println("Total Biaya Keseluruhan: Rp " + totalBiaya);
        System.out.println("==================================");

        sc.close();
    }
}
