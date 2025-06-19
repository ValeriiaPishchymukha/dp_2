package creational.builder;

public interface AnimalBuilder {
    void buildSpecies();
    void buildSound();
    void buildDiet();
    Animal getAnimal();
}