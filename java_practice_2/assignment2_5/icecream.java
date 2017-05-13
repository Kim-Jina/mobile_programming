/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class icecream extends cooking {
    icecream(){    // set ingredient, utensil, price
        setIngredient("ice");
        setUtensil("refrigerator");
        setPrice(1000);
    }
    public void print(){    // print function
        System.out.println("Class name : icecream");
        System.out.println("Instance variable: Ingredient("+getIngredient()+"), Utensil("+getUtensil()+"), Price("+getPrice()+")");
        System.out.println("Method : print, setIngredient, setUtensil, setPrice, getIngredient, getUtensil, getPrice");
    }
}
