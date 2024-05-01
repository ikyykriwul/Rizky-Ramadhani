package week7;

public class Mahasiswa {
   private String nim;
   private String nama;
   private String tanggallahir;
   
public String getNim() {
    return nim;
}

public void setNim(String nim) {
    this.nim = nim;
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public String getTanggallahir() {
    return tanggallahir;
}

public void setTanggallahir(String tanggallahir) {
    this.tanggallahir = tanggallahir;
}
  
public Mahasiswa(String nim, String nama, String tanggallahir) {
        this.nim = nim;
        this.nama = nama;
        this.tanggallahir = tanggallahir;
    }


}
