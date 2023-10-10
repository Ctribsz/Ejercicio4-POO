public class Plant extends Fosil {
    String tipo;
    String period;

    public Plant(String finder, String date, String era, String ubi, String tipo, String period) {
        super(finder, date, era, ubi);

        this.tipo = tipo;
        this.period = period;
    }

    public String getTipo(){
        return tipo;
    }

    public String getPer(){
        return period;
    }
    
}
