package creational.singleton;

public class SingletonExample {
    private static SingletonExample example = null;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (example == null) {
            example = new SingletonExample();
        }
        return example;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
