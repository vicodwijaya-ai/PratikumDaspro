package jobsheet5;

import java.util.Scanner;

public class netedUjianSkripsi28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.println("Apakah mahasiswa sudah bebas kompen (Ya/Tidak):");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukan jumblah log bimbingan Pembimbing 1:");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukan jumblah log bimbingan Pembimbing 2:");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftsr ujian skripasi";
            } else if (bimbinganP1 < 8 && bimbinganP2 >= 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencaapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali ";
            }
            System.out.println(pesan);
        }
    }
}