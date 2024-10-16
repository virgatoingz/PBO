package PraktikumPBO.Sesi5;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        while (angka != 0) {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
        }

        System.out.println("Program selesai.");
        input.close(); 
    }
}
