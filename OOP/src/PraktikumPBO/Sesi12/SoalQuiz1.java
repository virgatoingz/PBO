package PraktikumPBO.Sesi12;
class Dosen {
    protected String nik;
    protected String nama;

    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}

class Rektor extends Dosen {
    private int tahunMasuk;

    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void viewRektor() {
        view();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void viewDekan() {
        view();
        System.out.println("Fakultas: " + fakultas);
    }
}

public class SoalQuiz1 {
    public static void main(String[] args) {
        Rektor rektor = new Rektor("123", "Virga", 2015);
        System.out.println("Data Rektor:");
        rektor.viewRektor();

        Dekan dekan = new Dekan("456", "Prof. Mulia", "Ilmu Komputer");
        System.out.println("\nData Dekan:");
        dekan.viewDekan();
    }
}