package pizzaStorage;

import pizza.*;

public class KievStorageOfPizza extends GenerallStorageOfPizza {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("CheesePizza")) {
            return pizza = new CheesePizza();
        } else if (type.equals("VegiicePizza")) {
            return pizza = new VegiicePizza();
        }
        return null;
    }
}
