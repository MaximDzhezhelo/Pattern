import pizzaStorage.GenerallStorageOfPizza;
import pizzaStorage.KievStorageOfPizza;
import pizza.*;

public class TestPizza {

    public static void main (String [] arg){
        GenerallStorageOfPizza storageOfPizza = new KievStorageOfPizza();
        Pizza pizza = storageOfPizza.orderPizza("VegiicePizza");
        System.out.println(pizza);
    }
}
