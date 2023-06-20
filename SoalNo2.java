import java.util.Scanner;

public class SoalNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks : ");
        String text = input.nextLine();

        boolean isLengthFive = checkTextLength(text);

        if (isLengthFive) {
            System.out.println("Panjang teks adalah 5 karakter.");
        } else {
            System.out.println("Panjang teks bukan 5 karakter.");
        }
    }

    public static boolean checkTextLength(String text) {
        return text.length() == 5;
    }
}

