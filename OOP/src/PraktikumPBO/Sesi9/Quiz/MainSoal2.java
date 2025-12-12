package PraktikumPBO.Sesi9.Quiz;

class BangunDatar {
    public double luas() {
        return 0;
    }
}

class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}

class Lingkaran extends BangunDatar {
    double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public double luas() {
        return 3.14 * jari * jari;
    }
}

class Segitiga extends BangunDatar {
    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }
}

public class MainSoal2 {
    public static void main(String[] args) {
        Persegi p = new Persegi(5);
        Lingkaran l = new Lingkaran(7);
        Segitiga s = new Segitiga(6, 8);

        System.out.println("Luas Persegi: " + p.luas());
        System.out.println("Luas Lingkaran: " + l.luas());
        System.out.println("Luas Segitiga: " + s.luas());
    }
}
