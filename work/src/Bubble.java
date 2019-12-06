import java.io.IOException;
import java.util.Calendar;

public class Bubble extends Ingredient
{
    int safeday;
    public String toString()
    {
    	return "sonclass:"+this.safeday;
    }
    public Bubble(int year,int month,int day) 
    {
    	this.safeday=7;
    	super.name="Bubble";
    	super.productDate=Calendar.getInstance();
    	super.productDate.set(year,month,day);
    	
    }
    
}
