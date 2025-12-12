package PraktikumPBO.Sesi11.Quiz;

import java.util.*;

public class Soal4 {

    public static void login(String userInput, String passInput) throws UserNotFoundException, PasswordSalahException {

        String usernameBenar = "admin";
        String passwordBenar = "12345";

        if (!userInput.equals(usernameBenar)) {
            throw new UserNotFoundException("User tidak ditemukan!");
        }

        if (!passInput.equals(passwordBenar)) {
            throw new PasswordSalahException("Password yang dimasukkan salah!");
        }

        System.out.println("Login berhasil! Selamat datang " + usernameBenar);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String u = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String p = scanner.nextLine();

        try {
            login(u, p);

        } catch (UserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (PasswordSalahException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
