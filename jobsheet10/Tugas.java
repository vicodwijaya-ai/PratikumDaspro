package jobsheet10;

public class Tugas {
    public static void main(String[] args) {
        // a. Menyimpan hasil survey
        int[][] survey = {
            {5, 4, 3, 5, 4, 3},
            {4, 5, 4, 3, 5, 4},
            {3, 4, 5, 4, 3, 5},
            {5, 3, 4, 5, 4, 3},
            {4, 5, 3, 4, 5, 4},
            {3, 4, 5, 3, 4, 5},
            {5, 4, 3, 5, 4, 3},
            {4, 5, 4, 3, 5, 4},
            {3, 4, 5, 4, 3, 5},
            {5, 3, 4, 5, 4, 3}
        };

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("Rata-rata untuk setiap responden:");
        for (int i = 0; i < survey.length; i++) {
            double sum = 0;
            for (int j = 0; j < survey[i].length; j++) {
                sum += survey[i][j];
            }
            double average = sum / survey[i].length;
            System.out.printf("Responden %d: %.2f\n", i + 1, average);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < survey[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < survey.length; i++) {
                sum += survey[i][j];
            }
            double average = sum / survey.length;
            System.out.printf("Pertanyaan %d: %.2f\n", j + 1, average);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        double totalSum = 0;
        int totalElements = survey.length * survey[0].length;
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                totalSum += survey[i][j];
            }
        }
        double overallAverage = totalSum / totalElements;
        System.out.printf("\nRata-rata keseluruhan: %.2f\n", overallAverage);
    }
}
