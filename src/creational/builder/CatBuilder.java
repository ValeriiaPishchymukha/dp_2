package creational.builder;

public class CatBuilder implements AnimalBuilder {
    private Animal cat = new Animal();

    @Override
    public void buildSpecies() {
        cat.setSpecies("Cat");
    }

    @Override
    public void buildSound() {
        cat.setSound("Meow");
    }

    @Override
    public void buildDiet() {
        cat.setDiet("Carnivore");
    }

    @Override
    public Animal getAnimal() {
        return cat;
    }
}
