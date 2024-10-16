package PraktikumPBO.Sesi5;
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka = ");
        int angka =input.nextInt();

        if(angka > 0){
            System.out.println("Bilangan Positif");
        }
        if(angka < 0){
            System.out.println("Bilangan Negatif");
        }
        if(angka == 0){
            System.out.println("Nol");
        }
        input.close();
    }
}
