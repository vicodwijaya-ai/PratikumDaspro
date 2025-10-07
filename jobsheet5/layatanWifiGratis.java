
import java.util.Scanner;

public class layatanWifiGratis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String penggunaWIFI;
        int sks;

        System.out.println("Wifi gratis yang hanya diakses oleh civitas akademika. Siapa anda? (dosen/ mahasiswa?) ");
        penggunaWIFI = sc.next();
        if (penggunaWIFI.equalsIgnoreCase("dosen")) {
            System.out.println("Anda boleh mengakses wifi gratis");
        } else if (penggunaWIFI.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukan jumlah SKS yang diambil saat ini: ");   
            sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Anda boleh mengakses wifi gratis");
            } else {
                System.out.println("Maaf, anda tidak boleh mengakses wifi gratis");
            }
        } else {
            System.out.println("Maaf, anda bukan civitas akademika");

        }

    }
}
