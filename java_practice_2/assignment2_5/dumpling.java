/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class dumpling extends cooking {
    dumpling(){    // set ingredient, utensil, price
        setIngredient("meat");
        setUtensil("pan");
        setPrice(5000);
    }
    public void print(){    // print function
        System.out.println("Class name : dumpling");
        System.out.println("Instance variable: Ingredient("+getIngredient()+"), Utensil("+getUtensil()+"), Price("+getPrice()+")");
        System.out.println("Method : print, setIngredient, setUtensil, setPrice, getIngredient, getUtensil, getPrice");
    }
}
