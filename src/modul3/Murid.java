package modul3;

public class Murid extends Siswa {
    private String Sekolah;
    Murid (String Nama,int Absen,String Sekolah){
        super(Nama, Absen);
        this.Sekolah = Sekolah ;
    }
//    metode
    @Override
    public void info(){
        System.out.println("Sekolah:"+this.Sekolah);
        super.info();
    }
    //Akhir kelas Sekolah
    
    
    
}
