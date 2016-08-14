package ingredient.baseingredient;

public abstract class Ingredient {
    public String name;

    public void put() {
        System.out.println("put " + name);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                '}';
    }
}
