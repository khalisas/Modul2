
package modul3;

public class Employ extends Person {
    private String noKaryawan;
    //konstruktor 
    public Employ (String noKaryawan, String nama,int usia){
        super (nama,usia);
        this.noKaryawan = noKaryawan;
    }
    //metode 
    public void info(){
        System.out.println("no.Karyawan : "+ this.noKaryawan);
        super.info();
        
    }   
}//Akhir kelas Employ 


    
