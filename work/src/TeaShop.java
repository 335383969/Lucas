import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TeaShop implements Shop {
	List<Bubble> BubbleList=new ArrayList();
	List<Coconut> CoconutList=new ArrayList();
	@Override
	public void addIngredient(Ingredient ingre) {
		// TODO Auto-generated method stub
		if(ingre instanceof Bubble) {
			BubbleList.add((Bubble)ingre);
		}
		if(ingre instanceof Coconut) {
			CoconutList.add((Coconut)ingre);
		}
	}

	public void saleMilkTea(String name,String ingre)throws SoldOutException  {
		// TODO Auto-generated method stub
		if(ingre=="Bubble") {
			Bubble temp = null;
			if(this.BubbleList.isEmpty()) {
				throw new SoldOutException("no Bubble sale!");
			}
			Iterator<Bubble> it=BubbleList.iterator();
			Calendar now=Calendar.getInstance();
			long time1=now.getTimeInMillis();
			while(it.hasNext()) {
				 temp=it.next();
				if((time1-temp.productDate.getTimeInMillis())/1000/60/60/24>temp.safeday) {
					it.remove();
				}
				else {
					break;
				}
			}
			if(this.BubbleList.isEmpty()) {
				throw new SoldOutException("no Bubble sale!");
			}
			else {
				MilkTea milk=new MilkTea(name,ingre,temp.productDate.get(Calendar.YEAR),temp.productDate.get(Calendar.MONTH),temp.productDate.get(Calendar.DAY_OF_MONTH));
				it.remove();
				System.out.println("Has sale a Bubble MilkTea");
			}
		}
		if(ingre=="Coconut") {
			Coconut temp = null;
			if(this.CoconutList.isEmpty()) {
				throw new SoldOutException("no Coconut sale!");
			}
			Iterator<Coconut> it=CoconutList.iterator();
			Calendar now=Calendar.getInstance();
			long time1=now.getTimeInMillis();
			while(it.hasNext()) {
				 temp=it.next();
				if((time1-temp.productDate.getTimeInMillis())/1000/60/60/24>temp.safeday) {
					System.out.println("1111:"+(time1-temp.productDate.getTimeInMillis())/1000/60/60/24);
					it.remove();
				}
				else {
					break;
				}
			}
			if(this.CoconutList.isEmpty()) {
				throw new SoldOutException("no Coconut sale!");
			}
			else {
				MilkTea milk=new MilkTea(name,ingre,temp.productDate.get(Calendar.YEAR),temp.productDate.get(Calendar.MONTH),temp.productDate.get(Calendar.DAY_OF_MONTH));
				it.remove();
				System.out.println("Has sale a Coconut MilkTea");
			}
		}
	}
	
	public static void main(String[] args) throws IOException, SoldOutException {
		// TODO Auto-generated method stub
		TeaShop shop=new TeaShop();
		Bubble b=new Bubble(2019,11,4);
		shop.addIngredient(b);
		shop.saleMilkTea("123", "Bubble");
		shop.saleMilkTea("1234", "Coconut");
	}

}
