package PraktikumPBO.Sesi9.Quiz;

import java.time.LocalDate;

class Produk {
    String nama;
    double harga;
    int stok;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void infoProduk() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

    public boolean bisaDibeli() {
        return stok > 0;
    }
}

class Elektronik extends Produk {
    int garansi; // dalam bulan

    public Elektronik(String nama, double harga, int stok, int garansi) {
        super(nama, harga, stok);
        this.garansi = garansi;
    }

    @Override
    public void infoProduk() {
        super.infoProduk();
        System.out.println("Garansi: " + garansi + " bulan");
    }
}

class Pakaian extends Produk {
    String ukuran;

    public Pakaian(String nama, double harga, int stok, String ukuran) {
        super(nama, harga, stok);
        this.ukuran = ukuran;
    }

    @Override
    public void infoProduk() {
        super.infoProduk();
        System.out.println("Ukuran: " + ukuran);
    }
}

class Makanan extends Produk {
    LocalDate tanggalKadaluarsa;

    public Makanan(String nama, double harga, int stok, LocalDate tanggalKadaluarsa) {
        super(nama, harga, stok);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    public void infoProduk() {
        super.infoProduk();
        System.out.println("Kadaluarsa: " + tanggalKadaluarsa);
    }

    @Override
    public boolean bisaDibeli() {
        return stok > 0 && LocalDate.now().isBefore(tanggalKadaluarsa);
    }
}

public class MainSoal4 {
    public static void main(String[] args) {

        Elektronik e = new Elektronik("Laptop Gaming", 15000000, 10, 24);
        Pakaian p = new Pakaian("Jaket Hoodie", 250000, 5, "L");
        Makanan m = new Makanan("Roti", 15000, 20, LocalDate.of(2025, 12, 31));

        System.out.println("\n=== Elektronik ===");
        e.infoProduk();
        System.out.println("Bisa dibeli? " + e.bisaDibeli());

        System.out.println("\n=== Pakaian ===");
        p.infoProduk();
        System.out.println("Bisa dibeli? " + p.bisaDibeli());

        System.out.println("\n=== Makanan ===");
        m.infoProduk();
        System.out.println("Bisa dibeli? " + m.bisaDibeli());
    }
}
