package creational.prototype;

public class Author implements Prototype {
    String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public Prototype doClone() {
        return new Author(name);
    }

    public String toString() {
        return "The author's name is " + name;
    }
}
