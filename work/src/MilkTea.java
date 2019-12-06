import java.io.IOException;

public class MilkTea {
   String name;
   Ingredient ingre;
   public MilkTea(String name,String type,int year,int month,int day) {
	   if(type=="Bubble") {
		   this.ingre=new Bubble(year,month,day);
	   }
	   if(type=="Coconut") {
		   this.ingre=new Coconut(year,month,day);
	   }
	   this.name=name;
   }
   public String toString() {
   	return "sonclass:"+this.name+this.ingre.name;
   }
   
}
