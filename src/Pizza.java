import java.util.ArrayList;

public class Pizza {
    private String name;
    private Dough dough;
    private ArrayList<Topping> toppings;

    public Pizza(String name, Dough dough) {
        this.name = name;
        this.dough = dough;
        this.toppings = new ArrayList<>();
    }

    public Pizza(String name) {
        this.name = name;
        this.toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }
}