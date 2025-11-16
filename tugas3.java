import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        // Daftar menu makanan di kafe
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan '" + menu[posisi] + "' tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan yang Anda cari tidak ada di menu.");
        }

        sc.close();
    }
}
