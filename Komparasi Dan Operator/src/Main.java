
public class Main {

    public static void main(String[] args) {
        // ! komparasi logika
        System.out.println("Starting\n");

        // int a = 10, b = 10;
        // boolean hasil = (a == b);

        // System.out.println(a + " == " + b + " ---> " + hasil);

        // ! Operator LOGIKA ::::: Semua sama seperti C++ ada && , ||, !
        // ? Di tambah satu XOR (^)
        boolean a, b, hasil;
        a = true;
        b = true;
        hasil = a ^ b;
        System.out.println(a + " ^ " + b + " ==> " + hasil);

        a = true;
        b = false;
        hasil = a ^ b;
        System.out.println(a + " ^ " + b + " ==> " + hasil);

        a = false;
        b = true;
        hasil = a ^ b;
        System.out.println(a + " ^ " + b + " ==> " + hasil);

        a = false;
        b = false;
        hasil = a ^ b;
        System.out.println(a + " ^ " + b + " ==> " + hasil);

        System.out.println("\nEnding");
    }
}