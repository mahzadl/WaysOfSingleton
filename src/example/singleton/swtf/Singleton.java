package example.singleton.swtf;

import java.io.Serial;
import java.io.Serializable;

/**
 * Singleton that is serializable with transient fields (S.W.T.F.).
 * Labels: THREAD_SAFE, SERIALIZATION_FRIENDLY.
 *
 * @see example.singleton labels explanation
 */
public class Singleton implements Serializable {

    private transient Object instanceVariableA;
    private transient String instanceVariableB;
    private transient int instanceVariableC;

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        instanceVariableA = new Object();
        instanceVariableB = "";
        instanceVariableC = 42;
    }

    public void doSomething() { /* ... */ }

    @Serial
    public Object readResolve() {
        return INSTANCE;
    }
}
