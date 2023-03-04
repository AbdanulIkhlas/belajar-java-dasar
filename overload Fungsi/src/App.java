public class App {
    // ! overload fungsi adalah satu nama fungsi yang memiliki macam2 tipedata
    // ! parameter

    public static void main(String[] args) throws Exception {

        printAngka(5);
        printAngka(12.7f);
        printAngka(12.5d);

    }

    private static void printAngka(int nilaiInteger) {
        System.out.println("Print angka integer : " + nilaiInteger);
    }

    private static void printAngka(float nilaiFloat) {
        System.out.println("Print angka float : " + nilaiFloat);
    }

    private static void printAngka(double nilaiDouble) {
        System.out.println("Print angka double : " + nilaiDouble);
    }
}
