package example.singleton.pc;

/**
 * Private constant singleton.
 * Labels: THREAD_SAFE, EAGER_INITIALIZATION.
 *
 * @see example.singleton labels explanation
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() { /* ... */ }
}
