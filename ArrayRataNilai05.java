import java.util.Scanner;

public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        // Deklarasi array untuk menyimpan nilai mahasiswa
        int[] nilaiMhs = new int[jumlahMhs];
        double total = 0;
        int countLulus = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int countTidakLulus = 0;

        // Input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Menghitung total nilai dan jumlah mahasiswa yang lulus dan tidak lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                countLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                countTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        // Menghitung rata-rata nilai keseluruhan, lulus, dan tidak lulus
        double rata2 = total / nilaiMhs.length;
        double rata2Lulus = (countLulus > 0) ? totalLulus / countLulus : 0;
        double rata2TidakLulus = (countTidakLulus > 0) ? totalTidakLulus / countTidakLulus : 0;

        // Menampilkan hasil
        System.out.println("Rata-rata nilai semua mahasiswa = " + rata2);
        System.out.println("Banyak mahasiswa yang lulus (>70) = " + countLulus);
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);

        sc.close();
    }
}
