public class Fosil {
    String finder;
    String date;
    String era;
    String ubi;

    public Fosil(String finder, String date, String era, String ubi){
        this.finder = finder;
        this.date = date;
        this.era = era;
        this.ubi = ubi;
    }

    public String getFinder(){
        return finder;
    }
    
    public String getDate(){
        return date;
    }

    public String getEra(){
        return era;
    }

    public String getUbi(){
        return ubi;
    }
}
