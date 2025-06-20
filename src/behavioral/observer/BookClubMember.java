package behavioral.observer;

public class BookClubMember implements BookObserver {
    String name;
    public BookClubMember(String name) {
        this.name = name;
    }
    @Override
    public void doUpdate(String newBook) {
        System.out.println("The Book Club Member " + name + " has just found out about the new book, " + newBook);
    }
}
