package PraktikumPBO.Sesi9.Pegawai;

public class Kasir extends Pegawai {
    @Override
    public void menampilkan(){
        System.out.println("Nama : "+nama);
        System.out.println("Id Pegawai : "+id_pegawai);
        System.out.println("Gaji : "+gaji);
    }
    public void tugas(){
        System.out.println("Tugas : Melakukan Transaksi dengan Pembeli");
        System.out.println("---------------------------------");

    }
}