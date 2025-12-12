package PraktikumPBO.Sesi7;

public class MainKotak {
    public static void main(String[] args) {
        Kotak kotak1 = new Kotak(2,3,4);
        Kotak kotak2 = new Kotak(5);
        Kotak kotak3 = new Kotak();

        System.out.println("Volume Kotak1 : "+ kotak1.hitungVolume());
        System.out.println("Volume Kotak2 : "+ kotak2.hitungVolume());
        System.out.println("Volume Kotak3 : "+ kotak3.hitungVolume());
    }
}
