
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting\n");
        // ! INFORMATION
        /*
         * 1 byte = 8 bit
         * int = 4 byte = 32 bit
         */

        // ! komparasi logika

        // int a = 10, b = 10;
        // boolean hasil = (a == b);

        // System.out.println(a + " == " + b + " ---> " + hasil);

        // ! Operator LOGIKA ::::: Semua sama seperti C++ ada && , ||, !
        // ? Di tambah satu XOR (^)
        // System.out.println("---- OPERATOR LOGIKA ----");
        // boolean a, b, hasil;
        // a = true;
        // b = true;
        // hasil = a ^ b;
        // System.out.println(a + " ^ " + b + " ==> " + hasil);

        // a = true;
        // b = false;
        // hasil = a ^ b;
        // System.out.println(a + " ^ " + b + " ==> " + hasil);

        // a = false;
        // b = true;
        // hasil = a ^ b;
        // System.out.println(a + " ^ " + b + " ==> " + hasil);

        // a = false;
        // b = false;
        // hasil = a ^ b;
        // System.out.println(a + " ^ " + b + " ==> " + hasil);

        // ! Operator BItwise
        // ? merupakan operator untuk melakukan operasi pada nilai bit
        System.out.println("---- OPERATOR BITWISE ----\n");
        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;
        System.out.println("a = nilai awal");
        System.out.println("b = dikenai operator shift");
        System.out.println("c = dikenai operator bitwise");
        // ? Integer.toBinaryString(a) : convert integer ke binary string
        // ? .replace(' ', '0') : replace char ' ' menjadi '0'

        // * Operator SHIFT LEFT (<<) : menggeser n step ke kiri*/
        System.out.println("\n--- OPERATOR SHIFT LEFT ---\n");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("a ==> %d = %s\n", a, a_bits);
        b = (byte) (a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("b ==> %d = %s\n", b, b_bits);

        // * Operator SHIFT RIGHT (>>) : menggeser n step ke kanan*/
        System.out.println("\n--- OPERATOR SHIFT RIGHT ---\n");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("a ==> %d = %s\n", a, a_bits);
        b = (byte) (a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("b ==> %d = %s\n", b, b_bits);

        // * Operator BITWISE OR (|) /
        System.out.println("\n--- OPERATOR BITWISE OR ---\n");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("a ==> %d = %s\n", a, a_bits);
        b = (byte) (a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("b ==> %d = %s\n", b, b_bits);
        System.out.println("---------------------------OR");
        c = (byte) (a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("c ==> %d = %s\n", c, c_bits);

        // * Operator BITWISE AND (&) /
        System.out.println("\n--- OPERATOR BITWISE AND ---\n");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("a ==> %d = %s\n", a, a_bits);
        b = (byte) (a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("b ==> %d = %s\n", b, b_bits);
        System.out.println("---------------------------AND");
        c = (byte) (a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("c ==> %d  = %s\n", c, c_bits);

        // * Operator BITWISE XOR (^) /
        System.out.println("\n--- OPERATOR BITWISE XOR ---\n");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("a ==> %d = %s\n", a, a_bits);
        b = (byte) (a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("b ==> %d = %s\n", b, b_bits);
        System.out.println("---------------------------XOR");
        c = (byte) (a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("c ==> %d = %s\n", c, c_bits);

        // * Operator BITWISE NOT (~) /
        System.out.println("\n--- OPERATOR BITWISE NOT ---\n");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("a ==>  %d = %s\n", a, a_bits);
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("b ==> %d = %s\n", b, b_bits);

        System.out.println("\n\nEnding");
    }
}