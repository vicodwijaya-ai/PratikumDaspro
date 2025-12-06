
import java.util.Scanner;

public class RekapPenjualanCafe28 {

    static Scanner sc = new Scanner(System.in);

    public static void inputData(int[][] data, String[] namaMenu, int jumMenu, int jumHari) {
        // Input Nama Menu
        for (int i = 0; i < jumMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();

        }

        // Input Data Penjualan
        System.out.println("\n--- Input Data Penjualan ---");
        for (int i = 0; i < jumMenu; i++) {
            System.out.println("Input penjualan untuk menu " + namaMenu[i] + ":");
            for (int j = 0; j < jumHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
            
            sc.nextLine();
        }
    }

    public static void tampilData(int[][] data, String[] namaMenu, int jumMenu, int jumHari) {
        System.out.println("\n--- Rekap Data Penjualan ---");
        System.out.print("Menu\t\t");
        for (int j = 0; j < jumHari; j++) {
            System.out.print("H" + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < jumMenu; i++) {
            // Menggunakan printf agar tabel lebih rapi jika nama menu panjang
            System.out.printf("%-15s", namaMenu[i]);
            for (int j = 0; j < jumHari; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(int[][] data, String[] namaMenu, int jumMenu, int jumHari) {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < jumMenu; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < jumHari; j++) {
                totalPerMenu += data[i][j];
            }

            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                menuTerlaris = namaMenu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris + " (Total: " + maxPenjualan + ")");
    }

    public static void rataRata(int[][] data, String[] namaMenu, int jumMenu, int jumHari) {
        System.out.println("\n--- Rata-rata Penjualan per Menu ---");
        for (int i = 0; i < jumMenu; i++) {
            double total = 0;
            for (int j = 0; j < jumHari; j++) {
                total += data[i][j];
            }
            double rata = total / jumHari;
            // %.2f artinya membulatkan 2 angka belakang koma
            System.out.printf("%s: %.2f\n", namaMenu[i], rata);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu: ");
        int jumMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumHari = sc.nextInt();

        
        sc.nextLine();

        int[][] dataPenjualan = new int[jumMenu][jumHari];
        String[] namaMenu = new String[jumMenu];

        inputData(dataPenjualan, namaMenu, jumMenu, jumHari);
        tampilData(dataPenjualan, namaMenu, jumMenu, jumHari);
        menuTertinggi(dataPenjualan, namaMenu, jumMenu, jumHari);
        rataRata(dataPenjualan, namaMenu, jumMenu, jumHari);
    }
}
