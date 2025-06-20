package behavioral.state;

public class AngryState implements EmotionalState {
    @Override
    public String saySomething() {
        return "That was absolutely awful day!";
    }
}
