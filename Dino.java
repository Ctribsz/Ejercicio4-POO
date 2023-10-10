public class Dino extends Fosil {
    String ali;
    double size;
    double weigth;

    public Dino(String finder, String date, String era, String ubi, String ali, double size, double weigth) {
        super(finder, date, era, ubi);

        this.ali = ali;
        this.size = size;
        this.weigth = weigth;
    }

    public String getAli(){
        return ali;
    }

    public double getSize(){
        return size;
    }
    
    public double getWeigth(){
        return weigth;
    }
}
