package week1;
class AksiMahasiswa
{
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa(null, null, 0);
        mhs1.nim = "A11.2000.0000";
        mhs1.nama = "Harkespan";
        mhs1.usia = 22;
        mhs1.getIdentitas();
        mhs1.belajar();
  }
}