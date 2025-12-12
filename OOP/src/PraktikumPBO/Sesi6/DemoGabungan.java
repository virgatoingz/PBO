package PraktikumPBO.Sesi6;

public class DemoGabungan {
    // Variabel static public
    public static String namaKelas = "Pemrograman Berorientasi Objek";

    // Method static dengan return type void
    public static void tampilkanJudul() {
        System.out.println("=== " + namaKelas + " ===");
    }

    // Method non-static dengan return type int
    private int kali(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Memanggil method static langsung
        DemoGabungan.tampilkanJudul();

        // Membuat objek untuk method non-static
        DemoGabungan obj = new DemoGabungan();
        int hasil = obj.kali(3, 4);
        System.out.println("Hasil perkalian: " + hasil);
    }
}
