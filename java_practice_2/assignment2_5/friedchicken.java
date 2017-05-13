/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class friedchicken extends cooking {
    friedchicken(){    // set ingredient, utensil, price
        setIngredient("chicken");
        setUtensil("cook pot");
        setPrice(10000);
    }
    public void print(){    // print function
        System.out.println("Class name : friedchicken");
        System.out.println("Instance variable: Ingredient("+getIngredient()+"), Utensil("+getUtensil()+"), Price("+getPrice()+")");
        System.out.println("Method : print, setIngredient, setUtensil, setPrice, getIngredient, getUtensil, getPrice");
    }
}
