package week4;
import java.util.Scanner;
import week1.Mahasiswa;

public class Akademik {
   private static Scanner inp;

public static void main(String[] args) {
        int n;
        System.out.print("Masukkan Jumlah Data : ");
        inp = new Scanner(System.in);
        n = inp.nextInt();
        Mahasiswa[] mhs = new Mahasiswa[n];
        String nim;
        String nama;
        double ipk; // Change Double to double

        for (int i = 0; i < n; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan NIM:");
            nim = inp.next();
            System.out.print("Masukkan IPK:");
            ipk = inp.nextDouble();
            inp.nextLine(); // Consume the newline character
            System.out.print("Masukkan Nama:");
            nama = inp.nextLine();
            mhs[i] = new Mahasiswa(nim, nama, ipk); // Pass ipk as double
        }

        for (int i = 0; i < mhs.length; i++) {
            System.out.println();
        }
    }
}
