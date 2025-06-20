package behavioral.memento;

public class BalanceInfoCaretaker {
    Object objMemento;
    public void saveState(BalanceInfo balanceInfo) {
        objMemento = balanceInfo.save();
    }
    public void restoreState(BalanceInfo balanceInfo) {
        balanceInfo.restore(objMemento);
    }

}
