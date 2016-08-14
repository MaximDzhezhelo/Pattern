package pizza;

import ingredient.baseingredient.Cheese;
import ingredient.baseingredient.Dough;
import ingredient.baseingredient.Sauce;
import ingredient.baseingredient.Vegiies;

public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheece;
    Sauce sauce;
    Vegiies vegiies[];
    int cost;

    abstract void prepare();

    public void bake() {
        System.out.println("We bake");
    }

    public void cut() {
        System.out.println("We cut");
    }

    public void box() {
        System.out.println("Put in the box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "pizza{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
