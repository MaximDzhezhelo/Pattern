package pizzaStorage;

import ingredient.KievPizzaIngredientFactory;
import ingredient.PizzaIngredientFactory;
import pizza.*;

public class KievStorageOfPizza extends GenerallStorageOfPizza {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new KievPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style");
        } else if (type.equals("vegiice")) {
            pizza = new VegiicePizza(ingredientFactory);
            pizza.setName("Kiev style");
        }
        return pizza;
    }
}
