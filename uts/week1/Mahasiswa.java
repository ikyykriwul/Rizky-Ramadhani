package week1;
public class Mahasiswa {

  public String nama;
  public String nim;
  public int usia;
  //AksiMahasiswa.java
  public Mahasiswa(String nim, String nama, double ipk) {

  }
     public void belajar() {
        System.out.println(nama + " belajar");

  }
  public void getIdentitas() {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("NIM mahasiswa: " + nim);
        System.out.println("Usia Mahasiswa: " + usia);
  }
}
