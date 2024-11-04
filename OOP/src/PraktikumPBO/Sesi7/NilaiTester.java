package PraktikumPBO.Sesi7;
class Nilai {
    private double quis;
    private double uts;
    private double uas;
    public void setQuis(double x){
        if(x>=0 && x<=100){
            quis=x;
        }
    }
    public void setUts(double x){
        if(x>=0 && x<=100){
            uts=x;
        }
    }
    public void setUas(double x){
        if(x>=0 && x<=100){
            uas=x;
        }
    }
    public double getQuis(){
        return quis;
    }
    public double getUts(){
        return uts;
    }
    public double getUas(){
        return uas;
    }
    public double getNA(){
        return 0.2*quis+0.3*uts+0.5*uas;
    }
}
public class NilaiTester {
    public static void main(String[] args) {
        Nilai n=new Nilai();
        n.setQuis(90);
        n.setUts(70);
        n.setUas(150);
        System.out.println("NA : "+ n.getNA());
    }
    
}