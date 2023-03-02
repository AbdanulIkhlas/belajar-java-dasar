package LatihanAritmetika;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------------------------------------------------\n");
        // ! Membuat perhitungan luas persegi panjang
        System.out.println("----- Menghitung Luas Persegi Panjang -----");
        int luas, inputLebar, inputPanjang;

        // ? mengambil input dari user
        Scanner userInput = new Scanner(System.in);

        // ? convert nilai yang di scan diatas ke integer
        System.out.print("Masukkan Panjang: ");
        inputPanjang = userInput.nextInt();

        System.out.print("Masukkan Lebar: ");
        inputLebar = userInput.nextInt();

        luas = inputLebar * inputPanjang;

        System.out.println("Luas persegi panjang: " + luas);

        System.out.println("\n-------------------------------------------------\n");
    }

}
