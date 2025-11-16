
import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino",
            "Chocolate Ice"
        };

        System.out.println("--- Selamat Datang di Kafe ---");
        System.out.println("Daftar Menu Kami:");
        for (String item : menu) {
            System.out.println("- " + item);
        }
        System.out.println("---------------------------------");

        System.out.print("Masukkan nama pesanan yang ingin Anda cari: ");
        String makananDicari = sc.nextLine();

        // --- TAHAP PROSES (Linear Search) ---
        // Siapkan "bendera" (flag) untuk menandai apakah item ditemukan
        boolean ditemukan = false;
        int indeksDitemukan = -1; // Menyimpan lokasi (indeks) jika ditemukan

        // 1. Mulai pencarian dari awal (indeks 0) sampai akhir array
        for (int i = 0; i < menu.length; i++) {

            // 2. Bandingkan item yang dicari dengan item di menu saat ini
            //    (Menggunakan equalsIgnoreCase agar pencarian tidak case-sensitive)
            if (makananDicari.equalsIgnoreCase(menu[i])) {

                // 3. Jika SAMA, set bendera ke true dan simpan indeksnya
                ditemukan = true;
                indeksDitemukan = i;

                break;
            }
            // 5. Jika TIDAK SAMA, loop lanjut ke item berikutnya (i++)
        }

        // --- TAHAP OUTPUT ---
        // Tampilkan hasil berdasarkan nilai bendera 'ditemukan'
        System.out.println("\n--- Hasil Pencarian ---");
        if (ditemukan) {
            // Menggunakan menu[indeksDitemukan] untuk menampilkan nama yang benar
            // seandainya pengguna mengetik "nasi goreng" (huruf kecil)
            System.out.println(" Pesanan '" + menu[indeksDitemukan] + "' TERSEDIA di menu.");
        } else {
            System.out.println(" Maaf, pesanan '" + makananDicari + "' TIDAK TERSEDIA di menu.");
        }

        sc.close();
    }
}
