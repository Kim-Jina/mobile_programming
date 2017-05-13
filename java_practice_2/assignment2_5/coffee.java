/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class coffee extends cooking {
    coffee(){    // set ingredient, utensil, price
        setIngredient("bean");
        setUtensil("coffee pot");
        setPrice(3000);
    }
    public void print(){    // print function
        System.out.println("Class name : coffee");
        System.out.println("Instance variable: Ingredient("+getIngredient()+"), Utensil("+getUtensil()+"), Price("+getPrice()+")");
        System.out.println("Method : print, setIngredient, setUtensil, setPrice, getIngredient, getUtensil, getPrice");
    }
}
