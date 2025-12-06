import java.util.Scanner;

public class NilaiMahasiswa28 {

    // a. Fungsi isianArray: Mengisi nilai dari input user
    public static void isianArray(int[] arrayNilai, int jumlahMahasiswa) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = sc.nextInt();
        }
    }

    // b. Fungsi tampilArray: Menampilkan semua nilai
    public static void tampilArray(int[] arrayNilai, int jumlahMahasiswa) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + arrayNilai[i]);
        }
    }

    // c. Fungsi hitTot: Menghitung total nilai
    public static int hitTot(int[] arrayNilai, int jumlahMahasiswa) {
        int total = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += arrayNilai[i];
        }
        return total;
    }

    // d. Fungsi Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        // Membuat array dengan ukuran N
        int[] nilaiMahasiswa = new int[N];

        // Memanggil fungsi-fungsi
        isianArray(nilaiMahasiswa, N);
        tampilArray(nilaiMahasiswa, N);
        
        int total = hitTot(nilaiMahasiswa, N);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + total);
    }
}