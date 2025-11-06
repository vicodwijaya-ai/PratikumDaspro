
import java.util.Scanner;

public class HitungJumlahKuadrat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int batasN = 5;

        for (int n = 1; n <= batasN; n++) {
            int jumlah = 0;
            String tampilan = "";

            System.out.print(" n = " + n + " -> jumblah kuadrat = ");

            for (int j = 1; j <= n; j++) {
                int kuadrat = j * j;
                jumlah += kuadrat;

                tampilan += kuadrat;
                if (j < n) {
                    tampilan += " + ";
                }

            }

            System.out.print(tampilan);

            if (n > 1) {
                System.out.print(" = " + jumlah);
            }

            System.out.println();
        }
    }
}
