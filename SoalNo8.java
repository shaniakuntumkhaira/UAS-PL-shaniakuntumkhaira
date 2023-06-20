import java.util.ArrayList;
import java.util.List;

public class SoalNo8 {
    public static void main(String[] args) {
        String[] teks = {"nokia", "samsung", "dolar", "duduk", "asus", "semangat", "adaptasi", "elit"};

        int panjangMinimum = 4;
        int panjangMaksimum = 6;

        List<Integer> indeksDitemukan = cariIndeksDalamRentang(teks, panjangMinimum, panjangMaksimum);

        if (indeksDitemukan.isEmpty()) {
            System.out.println("Tidak ditemukan teks dalam rentang yang ditentukan.");
        } else {
            System.out.println("Teks ditemukan pada indeks direntang berikut :");
            for (int indeks : indeksDitemukan) {
                System.out.println(indeks);
            }
        }
    }

    public static List<Integer> cariIndeksDalamRentang(String[] teks, int panjangMinimum, int panjangMaksimum) {
        List<Integer> indeksDitemukan = new ArrayList<>();

        for (int i = 0; i < teks.length; i++) {
            String teksSaatIni = teks[i];
            int panjangTeks = teksSaatIni.length();

            if (panjangTeks >= panjangMinimum && panjangTeks <= panjangMaksimum) {
                indeksDitemukan.add(i);
            }
        }

        return indeksDitemukan;
    }
}
