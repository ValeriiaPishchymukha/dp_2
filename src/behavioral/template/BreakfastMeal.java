package behavioral.template;

public class BreakfastMeal extends Meal {
    @Override
    public void prepareIngredients() {
        System.out.println("Getting eggs, bread, and butter");
    }

    @Override
    public void cook() {
        System.out.println("Frying eggs and toasting bread");
    }

    @Override
    public void cleanUp() {
        System.out.println("Wiping table and washing frying pan");
    }
}
