package creational.builder;

public class Owner {

    private AnimalBuilder animalBuilder = null;
    public Owner(AnimalBuilder animalBuilder) {
        this.animalBuilder = animalBuilder;
    }


    public Animal getAnimal() {
        return animalBuilder.getAnimal();
    }
    public Animal constructAnimal() {
        animalBuilder.buildSpecies();
        animalBuilder.buildSound();
        animalBuilder.buildDiet();
        return animalBuilder.getAnimal();
    }
}
