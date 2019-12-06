import java.util.Calendar;

public abstract class Ingredient {
    String name;
    Calendar productDate;
    int safeday;
    public String toString() {
    	return "father class:"+this.name;
    }
}
