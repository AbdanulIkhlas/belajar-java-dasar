import java.util.Arrays; // ? library support array

public class Array {

    public static void main(String[] args) {
        // ! Penulisan Array assignment
        // ? tipedata[]namaVar = {isi}
        // ? tipedata namaVar[] = {isi}

        int[] arrayAngka = { 2, 10, 4, 5, 10, 9, 27, 38, 42, 10 };
        // System.out.println(arrayAngka[1]); // ?nilai = 10

        // * ---------------------------------- */
        System.out.println("\n\n");
        // ! Penulisan Array deklarasi
        // ? tipedata[] nama = new int [jumlahArray]
        // float arrayFloat[] = new float[5]; // ? default isi 0.0
        System.out.println(Arrays.toString(arrayAngka)); // ? hasil [2, 10, 4, 5]
        // ? hasil [0.0, 0.0, 0.0,0.0, 0.0]
        // System.out.println(Arrays.toString(arrayFloat));
        System.out.println("Banyak data dalam array : " + arrayAngka.length); // ? mengambil jumlah elemen pada array

        // * ---------------------------------- */
        System.out.println("\n\n");
        // ! perulangan angka menggunakan forEach
        System.out.println("Looping dengan ForEach");

        // ? menyimpan nilai pada arrayAngka ke variabel angka
        int i = 0;
        for (int angka : arrayAngka) {
            System.out.println("Nilai angka ke-" + i++ + " = " + angka);
        }

        // * ---------------------------------- */
        System.out.println("\n\n");
        // ! Operasi pada array
        int nilaiArrayAngka1[] = { 1, 2, 3, 4, 5 };
        int nilaiArrayAngka2[] = new int[5];

        // ? ini adalah method array pass by reference, memberikan address
        nilaiArrayAngka2 = nilaiArrayAngka1; // ? nilai memori alokasi akan sama
        // nilaiArrayAngka1 = nilaiArrayAngka2; // ? ini gak bisa, hasil 0 0 0 0
        System.out.println("Memori array 1 : " + nilaiArrayAngka1);
        System.out.println("Memori array 2 : " + nilaiArrayAngka2);

        System.out.println("Array 1 -> " + Arrays.toString(nilaiArrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(nilaiArrayAngka2));

        nilaiArrayAngka1[1] = 100;
        System.out.println("Array 1 sekarang -> " + Arrays.toString(nilaiArrayAngka1));
        System.out.println("Array 2 sekarang-> " + Arrays.toString(nilaiArrayAngka2));

    }

}
