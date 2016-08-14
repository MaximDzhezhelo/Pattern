package pizza;

import ingredient.PizzaIngredientFactory;

public class VegiicePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VegiicePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        vegiies = ingredientFactory.createVegiice();
    }
}
