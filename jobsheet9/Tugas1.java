package jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai mahasiswa ke- " + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }

        int total = 0;
        int max = nilai[0];
        int min = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            total += nilai [i];

            if (nilai[i] > max) max = nilai [i];
            if (nilai[i] < min) min = nilai [i];
        }

        double rata = (double) total / n;

        System.out.println("\n=== HASIL ===");
        System.out.println("Semua nilai: ");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa " + (i+1) + ": " + nilai[i]);
        }

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah : " + min);
        System.out.println("Rata-rata: "+    rata);
    }
}
