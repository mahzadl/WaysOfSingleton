package example.singleton.ec;

/**
 * Exposed constant singleton.
 * Labels: THREAD_SAFE, EAGER_INITIALIZATION.
 *
 * @see example.singleton labels explanation
 */
public class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() { }

    public void doSomething() { /* ... */ }
}
