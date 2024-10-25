package PraktikumPBO.Sesi6;
import java.util.Scanner;
class Virga {
     String aktifitas;
     String kelamin;
     String golongan;
     int umur;
    Scanner input = new Scanner(System.in);
    public Virga(String aktifitas,String kelamin,String golongan, int umur){
        this.aktifitas = aktifitas;
        this.kelamin = kelamin;
        this.umur = umur;
        this.golongan = golongan;
    }    
    void cekgolongan(){
        if(umur < 20){
            golongan="Remaja";
        }else if(umur < 16){
            golongan="Anak-Anak";
        }else{
            golongan="Dewasa";
        }
    }
    void cetakAtribut(){
        System.out.println("Aktifitas = " +aktifitas);
        System.out.println("Kelamin = " +kelamin);
        System.out.println("Umur = " +umur);
        System.out.println("Golongan = " +golongan);
    }
    public class ClassVirga {
    public static void main(String[] args) {
        Virga aku = new Virga("Belajar","Laki-Laki","",22);
        aku.cekgolongan();
        aku.cetakAtribut();
    }
        
    }
}
