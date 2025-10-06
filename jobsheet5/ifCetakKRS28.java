import java.util.Scanner;

public class ifCetakKRS28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = sc.nextBoolean();

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        // } else {
        //     System.out.println("Pembayaran UKT belum terverifikasi");
        //     System.out.println("Silakan lakukan pembayaran UKT terlebih dahulu");

        //     sc.close();
        // }

        String pesan = (uktLunas) ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : "Pembayaran UKT belum terverifikasi\nSilakan lakukan pembayaran UKT terlebih dahulu";
        System.out.println(pesan);
    }
}
