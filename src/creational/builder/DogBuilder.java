package creational.builder;

public class DogBuilder implements AnimalBuilder {
    private Animal dog = new Animal();

    @Override
    public void buildSpecies() {
        dog.setSpecies("Dog");
    }

    @Override
    public void buildSound() {
        dog.setSound("Bark");
    }

    @Override
    public void buildDiet() {
        dog.setDiet("Carnivore");
    }

    @Override
    public Animal getAnimal() {
        return dog;
    }
}
