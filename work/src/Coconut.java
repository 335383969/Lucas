import java.util.Calendar;

public class Coconut extends Ingredient {
   int safeday;
   public Coconut(int year,int month,int day) {
   	this.safeday=5;
   	super.name="Coconut";
   	super.productDate=Calendar.getInstance();
   	super.productDate.set(year,month,day);
   	
   }
   public String toString() {
   	return "sonclass:"+this.safeday;
   }
}
