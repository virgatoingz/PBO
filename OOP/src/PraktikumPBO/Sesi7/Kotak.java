package PraktikumPBO.Sesi7;

public class Kotak {
    double panjang;
    double lebar;
    double tinggi;
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
    public static void main(String[] args) {
        Kotak kotak1 = new Kotak(2,3,4);
        Kotak kotak2 = new Kotak(5);
        Kotak kotak3 = new Kotak();

        System.out.println("Volume Kotak1 : "+ kotak1.hitungVolume());
        System.out.println("Volume Kotak2 : "+ kotak2.hitungVolume());
        System.out.println("Volume Kotak3 : "+ kotak3.hitungVolume());
    }
}
