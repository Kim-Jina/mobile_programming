/**
 * Created by 진아 on 2016-10-15.
 */
abstract public class cooking extends assignment2_5{
    private String Ingredient;    // food ingredient
    private String Utensil;   // cooking utensil
    private int Price;  // price of food
    public void setIngredient(String ingredient){   // set food's ingredient
        Ingredient=ingredient;
    }
    public void setUtensil(String utensil){ // set cooking utensil
        Utensil=utensil;
    }
    public void setPrice(int price){    // set price
        Price=price;
    }
    public String getIngredient(){  // get food's ingredient
        return Ingredient;
    }
    public String getUtensil(){ // get cooking utensil
        return Utensil;
    }
    public int getPrice(){  // get price
        return Price;
    }
    public abstract void print();   // print function
}
