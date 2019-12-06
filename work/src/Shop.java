
public interface Shop {
   void addIngredient(Ingredient ingre);
   void saleMilkTea(String name,String ingre) throws SoldOutException;
}
