package PizzaStorage;

import Pizza.*;

public class KievStorageOfPizza extends GenerallStorageOfPizza {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("AmerPizza")) {
            return pizza = new AmerPizza();
        } else if (type.equals("DonPizza")) {
            return pizza = new DonPizza();
        }
        return null;
    }
}
