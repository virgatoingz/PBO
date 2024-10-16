package PraktikumPBO.Sesi5;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Batas Bawah : ");
        int batasBawah = input.nextInt();
        System.out.println("Masukkan Batas Atas : ");
        int batasAtas = input.nextInt();
        System.out.println("\nBilangan Genap :");
        for(int i = batasBawah; i <= batasAtas; i++){
            if(i % 2 == 0){
                System.out.println(i+"");
            }
        }
        System.out.println("\nBilangan Ganjil :");
        for(int i = batasBawah; i <= batasAtas; i++){
            if(i % 2 != 0){
                System.out.println(i+"");
            }
        }
        input.close();
    }
}
