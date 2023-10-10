public class Mamife extends Fosil {
    String diet;
    String habit;

    public Mamife(String finder, String date, String era, String ubi, String diet, String habit) {
        super(finder, date, era, ubi);

        this.diet = diet;
        this.habit = habit;
    }

    public String getDiet(){
        return diet;
    }
    
    public String getHabit(){
        return habit;
    }
}
