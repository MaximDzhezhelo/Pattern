package pizza;

import ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
   public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheece = ingredientFactory.createChecce();
        sauce = ingredientFactory.createSauce();
        System.out.println(dough + " " + cheece + " " + sauce);
    }
}
