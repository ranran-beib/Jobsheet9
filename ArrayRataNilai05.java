import java.util.Scanner;
public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();
        int[] nilai = new int[jumlahMhs];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        
        double totLulus = 0;
        int countLulus = 0;
        double totTidakLulus = 0;
        int countTidakLulus = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 70) {
                totLulus += nilai[i];
                countLulus++; 
            } else {
                totTidakLulus += nilai[i];
                countTidakLulus++; 
            }
        }

        System.out.println("\nRata-rata nilai lulus: " + (countLulus > 0 ? totLulus / countLulus : 0));
        System.out.println("Rata-rata nilai tidak lulus: " + (countTidakLulus > 0 ? totTidakLulus / countTidakLulus : 0));

        input.close();
    }
}