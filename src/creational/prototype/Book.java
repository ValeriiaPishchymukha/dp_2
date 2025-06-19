package creational.prototype;

public class Book implements Prototype {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public Prototype doClone() {
        return new Book(title);
    }

    public String toString() {
        return "This book's title is " + title;
    }
}
