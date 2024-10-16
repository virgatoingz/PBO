package PraktikumPBO.Sesi4;
import java.util.Scanner;

public class TugasSesi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Menu Utama
        System.out.println("=== MENU UTAMA ===");
        System.out.println("1. Menampilkan Tipe Data dalam Java dan Fungsinya");
        System.out.println("2. Menampilkan Gambar Trapesium menggunakan Looping");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        pilihan = scanner.nextInt();

        // Menggunakan switch-case untuk memilih menu
        switch (pilihan) {
            case 1:
                tampilkanTipeData();
                break;
            case 2:
                gambarTrapesium();
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        scanner.close();
    }

    // Fungsi untuk menampilkan tipe data dan fungsinya
    public static void tampilkanTipeData() {
        System.out.println("\n=== TIPE DATA DALAM JAVA ===");
        System.out.println("1. byte    : Angka kecil, rentang -128 hingga 127");
        System.out.println("2. short   : Angka kecil, rentang -32,768 hingga 32,767");
        System.out.println("3. int     : Angka bulat, rentang -2^31 hingga 2^31-1");
        System.out.println("4. long    : Angka besar, rentang -2^63 hingga 2^63-1");
        System.out.println("5. float   : Angka desimal, presisi 32-bit");
        System.out.println("6. double  : Angka desimal, presisi 64-bit");
        System.out.println("7. char    : Karakter tunggal, seperti 'A' atau '1'");
        System.out.println("8. boolean : Nilai benar atau salah (true/false)");
    }

    // Fungsi untuk menampilkan gambar trapesium menggunakan looping for
    public static void gambarTrapesium() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan tinggi trapesium: ");
        int tinggi = scanner.nextInt();
        int lebarAtas = 5;  // Lebar bagian atas trapesium
        int lebarBawah = lebarAtas + (tinggi - 1);  // Lebar bagian bawah trapesium

        System.out.println("\nGambar Trapesium:");
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < lebarAtas + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
