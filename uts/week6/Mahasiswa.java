package week6;

public class Mahasiswa {
  
  public String nim; 
  public String nama;
  public int sks;
  public int semester;
  public double spp;
 

  public Mahasiswa(String nim, String nama, int sks, int semester){
  this.nim = nim;
  this.nama = nama;
  this.sks = sks;
  this.semester = semester;
  }
  public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getSks() {
        return sks;
    }

    public int getSemester() {
        return semester;
    }
      public double hitungBiayaKuliah() {
        double biayaPerSks = 750000;
        if (semester <= 2) {
            biayaPerSks = 300000;
            spp = 3000000; 
        } else if (semester >= 3 && semester <= 6) {
            biayaPerSks = 275000;
            spp = 2900000; 
        } else {
            biayaPerSks = 250000;
            spp = 2750000; 
        }
        return sks * biayaPerSks + spp; 
        
    }
}
