package PraktikumPBO.Sesi7;
class Mahasiswa{
    public String nama;
    protected int usia;
    private String jurusan;

    public Mahasiswa(String nama,int usia,String jurusan){
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void setJurusan(String jurusanBaru){
        this.jurusan = jurusanBaru;
    }
    public void tampilanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Jurusan : " + jurusan);
    }
}
public class MhsTester{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", 21, "Teknik Informatika");
        System.out.println("Nama Mahasiswa : " + mahasiswa1.nama);
        System.out.println("Usia Mahasiswa : " + mahasiswa1.usia);
        System.out.println("Jurusan Mahasiswa : " + mahasiswa1.getJurusan());
        mahasiswa1.setJurusan("Sistem Informasi");
        System.out.println("Jurusan Mahasiswa Setelah Diubah : " + mahasiswa1.getJurusan());
        mahasiswa1.tampilanInfo();

    }
}