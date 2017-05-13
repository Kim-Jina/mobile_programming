/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class noodle extends cooking {
    noodle(){    // set ingredient, utensil, price
        setIngredient("noodle");
        setUtensil("pot");
        setPrice(3000);
    }
    public void print(){    // print function
        System.out.println("Class name : noodle");
        System.out.println("Instance variable: Ingredient("+getIngredient()+"), Utensil("+getUtensil()+"), Price("+getPrice()+")");
        System.out.println("Method : print, setIngredient, setUtensil, setPrice, getIngredient, getUtensil, getPrice");
    }
}
