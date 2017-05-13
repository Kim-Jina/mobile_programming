/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class steak extends cooking{
    steak(){    // set ingredient, utensil, price
        setIngredient("beef");
        setUtensil("pan");
        setPrice(40000);
    }
    public void print(){    // print function
        System.out.println("Class name : steak");
        System.out.println("Instance variable: Ingredient("+getIngredient()+"), Utensil("+getUtensil()+"), Price("+getPrice()+")");
        System.out.println("Method : print, setIngredient, setUtensil, setPrice, getIngredient, getUtensil, getPrice");
    }
}
