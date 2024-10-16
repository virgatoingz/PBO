package PraktikumPBO.Sesi5;

public class Soal4 {
    public static void main(String[] args) {
        int i, z = 0;
        for (i = 1; i <= 100; i++) {  // Perbaikan di sini
            if (i % 2 == 0) {
                z = z + 1;
                System.out.println("Angka Genap = " + i);
            }
        }
        System.out.println("Jumlah Angka Genap = " + z);
    }
}
