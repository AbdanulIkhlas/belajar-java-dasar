import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukkan nilai " + nilai);

        int hasilFaktorial = faktorial(nilai);
        System.out.println("Hasil Faktorial = " + hasilFaktorial);
    }

    private static int faktorial(int parameter) {
        if (parameter == 1) {
            return parameter;
        }
        return parameter * faktorial(parameter - 1);
    }

}
