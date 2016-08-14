package pizza;

public abstract class Pizza {
    String name;
    int cost;

    public void prepare() {
        System.out.println("prepare " + name);
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "pizza{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
