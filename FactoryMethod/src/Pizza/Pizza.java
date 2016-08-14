package Pizza;

public class Pizza {
    protected String name;
    protected String cost;

    public void prepare() {
        System.out.println("We prepare all ingredients for pizza");
    }

    public void bake() {
        System.out.println("We bake");
    }

    public void cut() {
        System.out.println("We cut");
    }

    public void box() {
        System.out.println("Put in the box");
    }

    @Override
    public String toString() {
        return this.name + " " + this.cost;
    }
}
