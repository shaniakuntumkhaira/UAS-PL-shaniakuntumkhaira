import java.util.ArrayList;
import java.util.List;

public class SoalNo6 {
    public static List<Integer> cariTeks(String[] array, String teksCari) {
        List<Integer> indeks = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(teksCari)) {
                indeks.add(i);
            }
        }

        return indeks;
    }
    public static void main(String[] args) {
        String[] array = {"Sistem Digital", "Organisasi Komputer", "Pemrograman Lanjut", "Matematika Diskrit", "Bahasa Inggris"};
        String teks = "Sistem Digital";

        List<Integer> indeks = cariTeks(array, teks);

        if (indeks.isEmpty()) {
            System.out.println("Teks '" + teks + "' tidak ditemukan dalam array.");
        } else {
            System.out.println("Teks '" + teks + "' ditemukan pada indeks: " + indeks);
        }
    }
}
