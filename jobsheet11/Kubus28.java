import java.util.Scanner;

public class Kubus28 {
    
    // Fungsi menghitung Volume (sisi x sisi x sisi)
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi menghitung Luas Permukaan (6 x sisi x sisi)
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        int s = sc.nextInt();

        int vol = hitungVolume(s);
        int luas = hitungLuasPermukaan(s);

        System.out.println("Volume Kubus: " + vol);
        System.out.println("Luas Permukaan Kubus: " + luas);
    }
}