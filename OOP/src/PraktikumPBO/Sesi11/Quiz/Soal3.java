package PraktikumPBO.Sesi11.Quiz;

import java.util.Scanner;

public class Soal3 {

    public static int bacaAngka() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        String input = scanner.nextLine();

        return Integer.parseInt(input); // dapat memicu NumberFormatException
    }

    public static void main(String[] args) {
        try {
            int angka = bacaAngka();
            System.out.println("Angka yang dimasukkan: " + angka);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input bukan angka yang valid!");
        }
    }
}
