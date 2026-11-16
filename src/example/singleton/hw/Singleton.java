package example.singleton.hw;

/**
 * 'Hello World!' singleton. The first one typically taught.
 * Labels: NOT_THREAD_SAFE, LAZY_INITIALIZATION.
 *
 * @see example.singleton labels explanation
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
