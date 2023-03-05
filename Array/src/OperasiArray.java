import java.util.Arrays;

public class OperasiArray {
    public static void main(String[] args) {
        System.out.println("\n\n");
        int arrayAngka1[] = { 1, 2, 3, 4, 5 };

        // ! mengubah array menjadi string
        System.out.println("Merubah Array menjadi string \n-------------------------");
        printArray(arrayAngka1, 1);

        // ! Mengcopy array
        System.out.println("\nMengcopy array \n-------------------------");
        int arrayAngka2[] = new int[5]; // ?deklarasi array kosong
        printArray(arrayAngka1, 1);
        printArray(arrayAngka2, 2);

        // ! Mengcopy dengan loop */
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        System.out.println("\nSetelah di copy dengan for\n-------------------------");
        printArray(arrayAngka1, 1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2, 2);
        System.out.println(arrayAngka2);

        // ! mengkopi dengan copyOf dan copyOfRange */
        System.out.println("\nSetelah di copy dengan copyOf\n-------------------------");
        int arrayAngka3[] = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1, 1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3, 3);
        System.out.println(arrayAngka3);

        System.out.println("\nSetelah di copy dengan copyOfRange\n-------------------------");
        int arrayAngka4[] = Arrays.copyOfRange(arrayAngka1, 2, 5); // ? ngebaca/copy dari index 2 ke index 5-1(index 4)
        printArray(arrayAngka1, 1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4, 4);
        System.out.println(arrayAngka4);

        // ! fill array
        System.out.println("\nFill array \n-------------------------");
        int arrayAngka5[] = new int[10];
        printArray(arrayAngka5, 5);
        Arrays.fill(arrayAngka5, 2); // ? mengubah semua isi array menjadi value val yaitu (2)
        printArray(arrayAngka5, 5);

        // ! Komparasi array : membandingkan 2 buah array
        System.out.println("\nKomparasi array \n-------------------------");
        int arrayAngka6[] = { 1, 9, 3, 4, 5, 6 };
        int arrayAngka7[] = { 8, 2, 3, 9, 5, 6 };

        printArray(arrayAngka6, 6);
        printArray(arrayAngka7, 7);
        System.out.println("\nMemabndingkan 2 buah array array \n-------------------------");
        if (Arrays.equals(arrayAngka6, arrayAngka7)) { // ? hasilnya true
            System.out.println("Array ini sama");
        } else {
            System.out.println("Array ini beda");
        }

        System.out.println("\nMengecek array mana yg lebih besar \n-------------------------");
        // ? jika hasilnya 0 berarti sama, 1 berarti lebih besar, -1 berarti lebih kecil
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7)); // ? mengecek apakah arrayAngka 6 > arrayAngka7

        System.out.println("\nMengecek array mana index yang berbeda \n-------------------------");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7)); // ? mengecek index mana yg berbeda, index yan
                                                                       // ?pertama kali ketemu yg berbeda

        // ! sort array
        System.out.println("\nSort array \n-------------------------");
        int arrayAngka8[] = { 1, 5, 3, 7, 34, 8 };
        printArray(arrayAngka8, 8);
        Arrays.sort(arrayAngka8);
        System.out.println("Setelah di sorting");
        printArray(arrayAngka8, 8);

        // ! search array
        System.out.println("\nSearch array \n-------------------------");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka); // ? harus setelah di sorting
        System.out.println("Angka " + angka + " ada di index ke-" + posisi);

        System.out.println("\n\n");
    }

    private static void printArray(int dataArray[], int i) {
        // ! menubah array ke string
        System.out.println("Array ke-" + i + " = " + Arrays.toString(dataArray));
    }
}
