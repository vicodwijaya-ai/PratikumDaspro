
import java.util.Scanner;

public class KasirBioskop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        int HARGA_PER_TIKET = 50000;

        int totalTiketHarian = 0;
        double totalPenjualanHarian = 0.0;

        System.out.println("=== Program Kasir Bioskop ===");
        System.out.println("Masukkan jumlah tiket per transaksi.");
        System.out.println("(Masukkan 0 untuk menutup kasir dan melihat total)");

        // 'while(true)' berarti loop ini akan berjalan selamanya
        // sampai kita perintahkan berhenti secara paksa.
        while (true) {

            System.out.print("\nMasukkan jumlah tiket: ");
            int jumlahTiket = scanner.nextInt();

            // Jika user input 0, ini adalah sinyal untuk berhenti.
            if (jumlahTiket == 0) {
                System.out.println("Kasir ditutup. Menghitung total harian...");
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid (negatif). Silakan masukkan ulang.");
                continue;
            }

            double diskon = 0.0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double hargaAwal = (double) jumlahTiket * HARGA_PER_TIKET;
            double jumlahDiskon = hargaAwal * diskon;
            double hargaAkhir = hargaAwal - jumlahDiskon;

            System.out.println("Subtotal transaksi ini: Rp " + hargaAkhir);

            totalTiketHarian = totalTiketHarian + jumlahTiket;
            totalPenjualanHarian = totalPenjualanHarian + hargaAkhir;

        }

        System.out.println("\n========================================");
        System.out.println("   Rekapitulasi Penjualan Harian");
        System.out.println("========================================");
        System.out.println("Total Tiket Terjual: " + totalTiketHarian + " tiket");
        System.out.println("Total Penjualan Harian: Rp " + totalPenjualanHarian);

        scanner.close();
    }
}
