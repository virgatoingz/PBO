package PraktikumPBO.Sesi9.Quiz;

class Pegawai {
    String nama;
    double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return gajiPokok;
    }
}

class PegawaiTetap extends Pegawai {
    double tunjangan;

    public PegawaiTetap(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }
}

class PegawaiKontrak extends Pegawai {
    double bonusPerProyek;
    int jumlahProyek;

    public PegawaiKontrak(String nama, double gajiPokok, double bonusPerProyek, int jumlahProyek) {
        super(nama, gajiPokok);
        this.bonusPerProyek = bonusPerProyek;
        this.jumlahProyek = jumlahProyek;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (bonusPerProyek * jumlahProyek);
    }
}

public class MainSoal3 {
    public static void main(String[] args) {
        PegawaiTetap tetap = new PegawaiTetap("Budi", 3000000, 1000000);
        PegawaiKontrak kontrak = new PegawaiKontrak("Siti", 2500000, 500000, 3);

        System.out.println("Gaji Pegawai Tetap: " + tetap.hitungGaji());
        System.out.println("Gaji Pegawai Kontrak: " + kontrak.hitungGaji());
    }
}
