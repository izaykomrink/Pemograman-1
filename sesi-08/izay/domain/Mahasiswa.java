package domain;

import java.util.List;
import java.util.ArrayList;

public class Mahasiswa {
    private String npm;
    private String nama;
    private String email;
    
    private List<Kehadiran> daftarKehadiran = 
        new ArrayList<Kehadiran>();
        
    private List<Batch> daftarBatch = 
        new ArrayList<Batch>();
    
    private List<Nilai> daftarNilai = 
        new ArrayList<Nilai>();
    
    public Double hitungIPK(){
        return 0d;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
}
