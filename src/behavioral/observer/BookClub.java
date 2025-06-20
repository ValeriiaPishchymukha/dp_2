package behavioral.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookClub implements BookSubject {
    Set<BookObserver> bookObservers;
    private String latestBook;

    public BookClub(String BookTitle) {
        bookObservers = new HashSet<BookObserver>();
        this.latestBook = BookTitle;
    }
    @Override
    public void addObserver(BookObserver bookObserver) {
        bookObservers.add(bookObserver);
    }
    @Override
    public void removeObserver(BookObserver bookObserver) {
        bookObservers.remove(bookObserver);
    }
    @Override
    public void doNotify() {
        Iterator<BookObserver> it = bookObservers.iterator();
        while (it.hasNext()) {
            BookObserver weatherObserver = it.next();
            weatherObserver.doUpdate(latestBook);
        }
    }
    public void addNewBook(String NewBook) {
        System.out.println("\nThe new book " + NewBook + " will be published soon.");
        latestBook = NewBook;
        doNotify();
    }

}
