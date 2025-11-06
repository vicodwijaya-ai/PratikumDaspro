
import java.util.Scanner;

public class KafeKopiSenja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeluruhPelanggan = 0;
        int totalSeluruhItem = 0;

        System.out.print("Jumbah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + "---");
            
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelangganCabang = sc.nextInt();
            int totalItemCabang = 0;
            
            for (int j = 1; j <= jumlahPelangganCabang; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int itemPerPelangagan = sc.nextInt();
                
                totalItemCabang += itemPerPelangagan;
            }
            
            System.out.println("Cabang " + i + ": ");
            System.out.println("- Pelangan: " + jumlahPelangganCabang + " orang");
            System.out.println("- item terjual: " + totalItemCabang);
            
            totalSeluruhPelanggan += jumlahPelangganCabang;
            totalSeluruhItem += totalItemCabang;
        }

            System.out.println("\n--- Total seluruh Cabang ---");
            System.out.println("Pelanggan: " + totalSeluruhPelanggan + " orang");
            System.out.println("Item terjual: " + totalSeluruhItem + " item ");

    }

}
