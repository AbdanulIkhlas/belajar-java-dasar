import java.util.*;

public class App {

    // ! Latihan menghitung fungsi luas dan keliling persegi

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // ? mengambil input user
        int panjang, lebar;

        System.out.print("Nilai Panjang : ");
        panjang = userInput.nextInt();
        System.out.print("Nilai Lebar   : ");
        lebar = userInput.nextInt();

        gambar(panjang, lebar);
        tampilkan(panjang, lebar);

    }

    private static int luas(int panjang, int lebar) {
        return panjang * lebar;
    }

    private static int keliling(int panjang, int lebar) {
        return (panjang + lebar) * 2;
    }

    private static void tampilkan(int panjang, int lebar) {
        System.out.println("Luas = " + luas(panjang, lebar));
        System.out.println("Keliling = " + keliling(panjang, lebar));
    }

    private static void gambar(int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
