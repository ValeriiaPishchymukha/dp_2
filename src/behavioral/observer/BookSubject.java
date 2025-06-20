package behavioral.observer;

public interface BookSubject {
    public void addObserver(BookObserver bookObserver);
    public void removeObserver(BookObserver bookObserver);
    public void doNotify();
}
