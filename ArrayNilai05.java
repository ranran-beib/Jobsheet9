import java.util.Scanner;
public class ArrayNilai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] nilai = new int[10];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }
        
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 70) {
                System.out.println("Nilai ke-" + i + " (" + nilai[i] + ") : Lulus");
            } else {
                System.out.println("Nilai ke-" + i + " (" + nilai[i] + ") : Tidak Lulus");
            }
        }
        
        input.close();
    }
}