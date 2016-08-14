package ingredient;

import ingredient.baseingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createChecce();

    public Vegiies[] createVegiice();
}
