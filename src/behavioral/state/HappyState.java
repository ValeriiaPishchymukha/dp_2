package behavioral.state;

public class HappyState implements EmotionalState {
    @Override
    public String saySomething() {
        return "Everything's awesome!";
    }
}
