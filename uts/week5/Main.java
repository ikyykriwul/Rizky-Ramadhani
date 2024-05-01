package week5;
import java.util.Scanner;

import week6.Mahasiswa;

public class Main {
  private static Scanner scanner;
    String nama1 = scanner.nextLine();
    String nim1 = scanner.nextLine();
    int sks1 = scanner.nextInt();
    int semester1 = scanner.nextInt();
  public static void main(String[] args) {
         Mahasiswa mhs1 = new Mahasiswa("A11.2000.0000", "Budi", 22, 3);
        System.out.println("Data Mahasiswa :");
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Nim: " + mhs1.getNim());
        System.out.println("Sks: " + mhs1.getSks());
        System.out.println("Semester: " + mhs1.getSemester());

        scanner = new Scanner(System.in);
        System.out.println("Program hitung biaya kuliah mahasiswa ");
        System.out.print("Nama: ");
        System.out.print("Nim: ");
        System.out.print("Sks: ");
      
        double biayaKuliah= mhs1.hitungBiayaKuliah();
      System.out.print("Biaya Kuliah Mahasiswa = " + biayaKuliah);
    }
}
