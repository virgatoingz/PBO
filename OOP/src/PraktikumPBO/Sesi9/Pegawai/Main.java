package PraktikumPBO.Sesi9.Pegawai;

public class Main {
    public static void main(String[] args) {
        Pegawai Pegawai = new Pegawai();
        Manager Manager = new Manager();
        Kasir Kasir = new Kasir();
        Koki Koki = new Koki();
        Pelayan Pelayan = new Pelayan();
        Satpam Satpam = new Satpam();

        Manager.nama = "Sifa";
        Manager.id_pegawai = 1;
        Manager.gaji = "7juta";

        Kasir.nama = "Aldi";
        Kasir.id_pegawai = 2;
        Kasir.gaji = "1,2juta";
    
        Koki.nama = "Reza";
        Koki.id_pegawai = 3;
        Koki.gaji = "2juta";
        
        Pelayan.nama = "Dean";
        Pelayan.id_pegawai = 4;
        Pelayan.gaji = "1,2juta";
        
        Satpam.nama = "Aldi";
        Satpam.id_pegawai = 2;
        Satpam.gaji = "1juta";

        Pegawai.menampilkan();
        Manager.menampilkan();
        Manager.tugas();
        Kasir.menampilkan();
        Kasir.tugas();
        Koki.menampilkan();
        Koki.tugas();
        Pelayan.menampilkan();
        Pelayan.tugas();
        Satpam.menampilkan();
        Satpam.tugas();
    }
}
