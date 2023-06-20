import java.util.Scanner;

public class SoalNo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = new String[10];
        int hitung = 0;

        // Menerima 10 input teks
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan teks ke-" + (i + 1) + ": ");
            text[i] = input.nextLine();
        }

        // Menghitung banyaknya teks dengan panjang 5 karakter
        for (int i = 0; i < 10; i++) {
            if (text[i].length() == 5) {
                hitung++;
            }
        }

        // Menampilkan hasil
        System.out.println("Jumlah teks dengan panjang 5 karakter : " + hitung);
    }
}
