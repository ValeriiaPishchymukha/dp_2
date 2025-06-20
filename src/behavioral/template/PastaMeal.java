package behavioral.template;

public class PastaMeal extends Meal {
    @Override
    public void prepareIngredients() {
        System.out.println("Getting pasta, tomato sauce, and cheese");
    }

    @Override
    public void cook() {
        System.out.println("Boiling pasta and adding sauce");
    }

    @Override
    public void cleanUp() {
        System.out.println("Washing dishes and cleaning the kitchen");
    }
}
