/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class pizza extends cooking {
    pizza(){    // set ingredient, utensil, price
        setIngredient("dow");
        setUtensil("oven");
        setPrice(10000);
    }
    public void print(){    // print function
        System.out.println("Class name : pizza");
        System.out.println("Instance variable: Ingredient("+getIngredient()+"), Utensil("+getUtensil()+"), Price("+getPrice()+")");
        System.out.println("Method : print, setIngredient, setUtensil, setPrice, getIngredient, getUtensil, getPrice");
    }
}
