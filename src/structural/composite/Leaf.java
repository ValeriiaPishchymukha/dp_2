package structural.composite;

public class Leaf implements Component {
    String name;
    public Leaf(String name) {
        this.name = name;
    }
    @Override
    public void sayHello() {
        System.out.println(name + " says hello");
    }
    @Override
    public void sayGoodbye() {
        System.out.println(name + " says goodbye");
    }
}
