
import java.util.Scanner;

public class sistemPerpustakaan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ktm;
        boolean regOnline;

        System.out.println("Apakah anda memiliki KTM? (true/false)");
        ktm = scanner.nextBoolean();
        System.out.println("Apakah anda memiliki registrasi online? (true/false)");
        regOnline = scanner.nextBoolean();
        if (ktm == true || regOnline == true) {
            System.out.println("Anda boleh masuk");
        } else {
            System.out.println("Anda tidak boleh masuk");

        }

    }

}

