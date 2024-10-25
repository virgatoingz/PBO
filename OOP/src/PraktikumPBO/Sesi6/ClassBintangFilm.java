package PraktikumPBO.Sesi6;

class BintangFilm {
    private String nama;
    private Boolean pria;

    BintangFilm(String nama, Boolean pria){
        this.nama =nama;
        this.pria = pria;
    }

    private void Isikan(String nama, Boolean pria){
        this.nama = nama;
        this.pria = pria;
    }

    String perolehnama(){
        return(nama);
    }
    String perolehJenisKelamin(){
        if(pria)
            return("Pria");
        else
            return("Wanita");
    }
}
public class ClassBintangFilm {
    public static void main(String[] args) {
        BintangFilm siA = new BintangFilm("Budi",true);
        BintangFilm siB = new BintangFilm("Hani",false);
        System.out.println("siA => " + siA.perolehnama() + ", " + siA.perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehnama() + ", " + siB.perolehJenisKelamin());
    }
    
}