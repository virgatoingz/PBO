package PraktikumPBO.Sesi12;

interface Kendaraan {
    void start();
    void stop();
}

abstract class Transportasi {
    protected String jenisTransportasi;

    public Transportasi(String jenis) {
        this.jenisTransportasi = jenis;
    }

    
    public abstract void displayInfo();

    
    public void jenisTransportasi() {
        System.out.println("Jenis transportasi: " + this.jenisTransportasi);
    }
}


final class Mobil extends Transportasi implements Kendaraan {
    private int jumlahRoda;

    public Mobil(String jenis, int jumlahRoda) {
        super(jenis);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void start() {
        System.out.println("Mobil dinyalakan.");
    }

    @Override
    public void stop() {
        System.out.println("Mobil dimatikan.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Informasi Mobil:");
        System.out.println("Jenis Transportasi: " + this.jenisTransportasi);
        System.out.println("Jumlah Roda: " + this.jumlahRoda);
    }
}


class Motor extends Transportasi implements Kendaraan {
    private int cc;

    public Motor(String jenis, int cc) {
        super(jenis);
        this.cc = cc;
    }

    @Override
    public void start() {
        System.out.println("Motor dinyalakan.");
    }

    @Override
    public void stop() {
        System.out.println("Motor dimatikan.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Informasi Motor:");
        System.out.println("Jenis Transportasi: " + this.jenisTransportasi);
        System.out.println("Kapasitas Mesin: " + this.cc + " cc");
    }
}


public class SoalQuiz4 {
    public static void main(String[] args) {
        
        Mobil mobil = new Mobil("Mobil Pribadi", 4);
        mobil.jenisTransportasi();
        mobil.start();
        mobil.displayInfo();
        mobil.stop();

        System.out.println();

        
        Motor motor = new Motor("Motor Sport", 150);
        motor.jenisTransportasi();
        motor.start();
        motor.displayInfo();
        motor.stop();
    }
}
