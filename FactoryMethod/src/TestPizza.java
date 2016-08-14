import PizzaStorage.GenerallStorageOfPizza;
import PizzaStorage.KievStorageOfPizza;
import Pizza.*;

public class TestPizza {

    public static void main (String [] arg){
        GenerallStorageOfPizza storageOfPizza = new KievStorageOfPizza();
        Pizza pizza = storageOfPizza.orderPizza("AmerPizza");
        System.out.println(pizza);
    }
}
