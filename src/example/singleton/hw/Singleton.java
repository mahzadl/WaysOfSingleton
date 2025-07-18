package example.singleton.hw;

/**
 * @see example.singleton.hw
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() { /* ... */ }
}
