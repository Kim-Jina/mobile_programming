/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class dimsum extends cooking {
    dimsum(){    // set ingredient, utensil, price
        setIngredient("meat");
        setUtensil("steamer");
        setPrice(8000);
    }
    public void print(){    // print function
        System.out.println("Class name : dimsum");
        System.out.println("Instance variable: Ingredient("+getIngredient()+"), Utensil("+getUtensil()+"), Price("+getPrice()+")");
        System.out.println("Method : print, setIngredient, setUtensil, setPrice, getIngredient, getUtensil, getPrice");
    }
}
