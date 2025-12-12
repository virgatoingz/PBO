package PraktikumPBO.Testing;
import java.util.Scanner;

public class Bilangaterbesar {
    public static void main(string[] args) {
        Scanner scanner = new Scaner (System.in);
        System.out.print ("masukan jumlah pertama : ");
        int bil1 = Scanner.inputint();
        System.out.print("masukanjumlah kedua : ");
        int bil2 = Scanner.inputint();

        if  (bil1 > bil2) {
            System.out.println("bilnagn  terbesar adalah : " + bil1);
        } else if (bil1 < bil2) {
            System.out.println("bilangan terbesar adalh : " + bil2);
        
        
        }
    }
}