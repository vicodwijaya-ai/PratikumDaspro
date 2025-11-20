package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom;

        String[][] penonton = new String[4][2];

        while (true) {
            // 1. MENU UTAMA
            System.out.println("--- MENU ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                boolean kursiValid = false;

                while (!kursiValid) {
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    // 2. VALIDASI KURSI TERSEDIA 
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Warning: Kursi tidak tersedia! (Baris 1-4, Kolom 1-2)");
                    } // VALIDASI KURSI TERISI
                    else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Warning: Kursi sudah terisi oleh penonton lain! Silakan pilih kursi lain. ");

                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpah.");
                        kursiValid = true;
                    }
                }

            } else if (menu == 2) {

                System.out.println("--- DAFTAR PENONTON ---");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {

                        String namaPenonton = penonton[i][j];
                        if (namaPenonton == null) {
                            namaPenonton = "***";

                        }
                        System.out.println("Penonton pada baris ke-" + (i + 1) + ", kolam ke-" + (j + 1) + ": " + namaPenonton);
                    }
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih.");
                break;
            } else {
                System.out.println("Menu tidak valid");
            }
        }
        
    }
}


            // System.out.print("Input penonton lainnya? (y/n): ");
            // next = sc.nextLine();
            // if (next.equalsIgnoreCase("n")) {
            //     break;
            // }