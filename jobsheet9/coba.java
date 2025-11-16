package jobsheet9;

import java.util.Scanner;

public class coba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] fruits = {"apel", "mangga", "duren", "semangka", "Anggur", "Nanas", "Weci", "Brontak"};

        int tengah = fruits.length/2;

        System.out.println("Buah yang tengah: " + fruits[tengah]);

        // for ( String buah : fruits ){
        //     System.out.println(buah);
        // }

        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println("Buah" + i + ": " + fruits[i]);
            
        // }
        // System.out.println();

        // int tengahKiri =  (fruits.length/2 - 2);
        // int tengahKanan  = (fruits.length/2);

        // System.out.println("Elemen tengah kiri= " + fruits[tengahKiri]);
        // System.out.println("Elemen tengah kanan= " + fruits[tengahKanan]);
    }
}