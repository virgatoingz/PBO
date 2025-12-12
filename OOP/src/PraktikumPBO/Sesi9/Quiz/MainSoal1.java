package PraktikumPBO.Sesi9.Quiz;

class Hewan {
    String nama;
    int usia;

    public Hewan(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
}

class Kucing extends Hewan {

    public Kucing(String nama, int usia) {
        super(nama, usia);
    }

    public void bersuara() {
        System.out.println("Meong!");
    }
}

public class MainSoal1 {
    public static void main(String[] args) {
        Kucing k = new Kucing("Oren", 2);

        System.out.println("Nama: " + k.nama);
        System.out.println("Usia: " + k.usia + " tahun");
        System.out.print("Suara: ");
        k.bersuara();
    }
}