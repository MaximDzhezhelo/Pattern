package ingredient;

import ingredient.baseingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheece createChecce();

    public Vegiies[] createVegiice();
}
