public class SoalNo9 {
    public static void main(String[] args) {
        int[] angka = {22, 35, 8, 50, 10, 70, 45};
        int indeks = findLargestMultipleOfFive(angka);

        if (indeks != -1) {
            System.out.println("Angka terbesar dari kelipatan 5 tersebut adalah " + angka[indeks]);
            System.out.println("Terdapat pada Indeks ke " + indeks);
        } else {
            System.out.println("Tidak ada angka yang merupakan kelipatan 5 dalam array.");
        }
    }

    public static int findLargestMultipleOfFive(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        int indeks = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                if (arr[i] > maxNumber) {
                    maxNumber = arr[i];
                    indeks = i;
                }
            }
        }
        return indeks;
    }
}
