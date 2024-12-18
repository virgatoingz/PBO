package PraktikumPBO.Sesi12;
interface Transportasi1 {
    int idz = 0;

    void tampil();
    void setData();
    int getId();
}


class Gojek implements Transportasi1 {
    protected int harga;
    protected int id;

    @Override
    public void tampil() {
        System.out.println("Gojek - ID: " + id + ", Harga: " + harga);
    }

    @Override
    public void setData() {
        this.id = 1;
        this.harga = 50000;
    }

    @Override
    public int getId() {
        return id;
    }
}


class Bayar extends Gojek {
    //private int jarak;
    private int total;
    private String nama;

    public int bayar(int jarak) {
        //this.jarak = jarak;
        this.total = jarak * harga;
        return total;
    }

    @Override
    public void tampil() {
        System.out.println("Bayar - Nama: " + nama + ", Total Bayar: " + total);
    }

    @Override
    public void setData() {
        super.setData();
        this.nama = "Pelanggan A";
        //this.jarak = 10;
    }
}


public class SoalQuiz2 {
    public static void main(String[] args) {
        
        Gojek gojek = new Gojek();
        gojek.setData();
        System.out.println("Data Gojek:");
        gojek.tampil();

        
        Bayar bayar = new Bayar();
        bayar.setData();
        System.out.println("\nData Bayar:");
        int total = bayar.bayar(10);
        bayar.tampil();
        System.out.println("Total Pembayaran: " + total);
    }
}