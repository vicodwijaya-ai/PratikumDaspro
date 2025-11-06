import java.util.Scanner;

public class CetakPersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Error: Nilai n minimal harus 3. ");
        }else{
            System.out.println("\nHasil untk n =" + n + ": ");

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <=n; j++) {

                    if (i == 1 || i == n || j ==1 || j == n) {
                        System.out.print(n);
                        
                    }else{
                        System.out.print(" ");
                    }
                    if (j < n) {
                        System.out.print(" ");
                        
                    }
                }
                System.out.println();
            }
            sc.close();
        }
    }
}
