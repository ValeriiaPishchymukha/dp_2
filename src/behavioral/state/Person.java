package behavioral.state;

public class Person implements EmotionalState {
    EmotionalState emotionalState;
    public Person(EmotionalState emotionalState) {
        this.emotionalState = emotionalState;
    }
    public void setEmotionalState(EmotionalState emotionalState) {
        this.emotionalState = emotionalState;
    }
    @Override
    public String saySomething() {
        return emotionalState.saySomething();
    }
}
