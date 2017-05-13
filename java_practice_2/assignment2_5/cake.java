/**
 * Created by 진아 on 2016-10-15.
 */
import java.util.*;

public class cake extends cooking{
    cake(){    // set ingredient, utensil, price
        setIngredient("flour");
        setUtensil("oven");
        setPrice(20000);
    }
    public void print(){    // print function
        System.out.println("Class name : cake");
        System.out.println("Instance variable: Ingredient("+getIngredient()+"), Utensil("+getUtensil()+"), Price("+getPrice()+")");
        System.out.println("Method : print, setIngredient, setUtensil, setPrice, getIngredient, getUtensil, getPrice");
    }
}
