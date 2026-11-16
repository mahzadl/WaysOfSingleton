package example.singleton.e;

/**
 * Enum singleton.
 * Labels: THREAD_SAFE, SERIALIZATION_FRIENDLY, EAGER_INITIALIZATION.
 *
 * @see example.singleton labels explanation
 */
public enum Singleton {

    INSTANCE;

    public void doSomething() { /* ... */ }
}
