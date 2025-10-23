package jobsheet7;

import java.util.Scanner;

public class KafeDoWhile28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int kopi,teh,roti;
        int hargaKopi= 12000, hargaTeh= 7000, hargaRoti= 20000;
        int totalHarga;
        String namaPelanggan;

        do {
            System.out.println("Masukkan nama pelanggan ( ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. ");
                break;
            }
            System.out.println("Jumblah kopi: ");
            kopi= sc.nextInt();
            System.out.println("Jumblah teh: ");
            teh= sc.nextInt();
            System.out.println("Jumblah roti: ");
            roti= sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc. nextLine();

        } while (true);
        System.out.println("Semua transaksi selesai.");
        
    }
}