
import java.util.Scanner;

public class ProgramParkir {

    public static void main(String[] args) {

        int jenis;
        int durasi;
        int total = 0;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar):");

            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {

                System.out.println("Masukkan durasi parkir (jam):");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                    System.out.println("Biaya: Rp 12.500 (Tarif flat > 5 jam)");
                } else {

                    if (jenis == 1) {
                        int biaya = durasi * 3000;
                        total += biaya;
                        System.out.println("Biaya: Rp " + biaya);
                    } else if (jenis == 2) {
                        int biaya = durasi * 2000;
                        total += biaya;
                        System.out.println("Biaya: Rp " + biaya);
                    }
                }
            }

        } while (jenis != 0);

        System.out.println("Total pendapatan parkir: Rp " + total);

        sc.close();
    }
}
