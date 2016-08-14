package ingredient;

import ingredient.baseingredient.Cheese;
import ingredient.baseingredient.Dough;
import ingredient.baseingredient.Sauce;
import ingredient.baseingredient.Vegiies;
import ingredient.baseingredient.vegiies.Carrot;
import ingredient.baseingredient.vegiies.Garlic;
import ingredient.kievingredient.KievCheese;
import ingredient.kievingredient.KievDough;
import ingredient.kievingredient.KievSauce;

public class KievPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new KievDough();
    }

    @Override
    public Sauce createSauce() {
        return new KievSauce();
    }

    @Override
    public Cheese createChecce() {
        return new KievCheese();
    }

    @Override
    public Vegiies [] createVegiice() {
        Vegiies vegiies[] = {new Garlic(), new Carrot()};
        return vegiies;
    }
}
