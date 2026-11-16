package example.singleton.ss;

/**
 * Single synchronized singleton.
 * Labels: THREAD_SAFE, PERFORMANCE_HEAVY, LAZY_INITIALIZATION.
 * The word "single" is here used to distinguish it from the "Double-Checked Locking" idiom.
 *
 * @see example.singleton labels explanation
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() { }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() { /* ... */ }
}
