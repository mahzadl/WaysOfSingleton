package example.singleton.ec;

/**
 * @see example.singleton.ec
 */
public class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() { }

    public void doSomething() { /* ... */ }
}
