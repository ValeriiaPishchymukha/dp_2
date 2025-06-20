package behavioral.memento;

public class BalanceInfo {
    String personName;
    int day;
    int balance;
    public BalanceInfo(String personName, int day, int balance) {
        this.personName = personName;
        this.day = day;
        this.balance = balance;
    }
    public String toString() {
        return "Name: " + personName + ", day number: " + day + ", balance: " + balance;
    }
    public void setDayNumberAndBalance(int dayNumber, int balance) {
        this.day = dayNumber;
        this.balance = balance;
    }
    public Memento save() {
        return new Memento(personName, day, balance);
    }
    public void restore(Object objMemento) {
        Memento memento = (Memento) objMemento;
        personName = memento.mementoPersonName;
        day = memento.mementoDayNumber;
        balance = memento.mementoBalance;
    }
    private class Memento {
        String mementoPersonName;
        int mementoDayNumber;
        int mementoBalance;
        public Memento(String personName, int dayNumber, int balance) {
            mementoPersonName = personName;
            mementoDayNumber = dayNumber;
            mementoBalance = balance;
        }
    }


}
