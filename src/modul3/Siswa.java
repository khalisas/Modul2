
package modul3;

public class Siswa {
    private String Nama;
    
    private int Absen;
    
    public Siswa(String Nama, int Absen){
        this.Nama = Nama;
      
        this.Absen = Absen;
        
    }
    //metode
    public void info(){
        System.out.println("Nama:"+this.Nama);
        
        System.out.println("Absen:"+this.Absen);
        
    }
}

