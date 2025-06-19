package creational.builder;

public class Animal {
    private String species;
    private String sound;
    private String diet;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void describe() {
        System.out.println("Species: " + species);
        System.out.println("Sound: " + sound);
        System.out.println("Habitat: " + diet);
        System.out.println();
    }
}
