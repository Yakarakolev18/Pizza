public class Conference {
    private String flourType;
    private int weight;
    private String topping;
    private String pizzaName;
    private int toppingCount;

    private Validations validations;

    public Conference(String flourType, int weight, String topping, String pizzaName, int toppingCount) {
        this.flourType = flourType;
        this.weight = weight;
        this.topping = topping;
        this.pizzaName = pizzaName;
        this.toppingCount = toppingCount;

        this.validations = new Validations();
    }

    public int calculateCalories() {
        //return 0;
    }

    public void printData() {}

    public boolean isValid() {
        return validations.isValidFlourType(flourType)
                && validations.isValidWeight(weight)
                && validations.isValidTopping(topping)
                && validations.isValidPizzaName(pizzaName)
                && validations.isValidToppingCount(toppingCount);
    }
}
