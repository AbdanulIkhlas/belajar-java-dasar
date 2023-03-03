package method;

//! Belajar  Method/function
public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------------------------------\n");

        int x, y;
        x = 10;
        y = hitung(x);
        System.out.println(y);

        System.out.println("\n-------------------------------\n");
    }

    public static int hitung(int x) {
        int hasil = (x + 2) * x;

        return hasil;

    }
}