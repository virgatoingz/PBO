package PraktikumPBO.Sesi7;

public class Kotak {
    double panjang;
    double lebar;
    double tinggi;
    // ini konstruktor
    public Kotak(double p,double l,double t){
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }
    public Kotak(double sisi){
        panjang = lebar = tinggi = sisi;
    }
    public Kotak(){
        panjang = 5;
        lebar = 3;
        tinggi = 8;
    }
    public double hitungVolume(){
        return (panjang*lebar*tinggi);
    }
}
