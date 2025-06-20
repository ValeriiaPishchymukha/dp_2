package behavioral.state;

public class SadState implements EmotionalState {
    @Override
    public String saySomething() {
        return "Sorry, it was a tough day...";
    }

}
