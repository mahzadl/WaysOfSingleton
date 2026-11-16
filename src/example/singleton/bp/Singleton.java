package example.singleton.bp;

/**
 * Bill Pugh's singleton.
 * Labels: THREAD_SAFE, LAZY_INITIALIZATION.
 * This is also a better and more generally suitable solution, compared to any flavor of
 * the "Double-Checked Locking" idiom.
 *
 * @see example.singleton labels explanation
 */
public class Singleton {

    public Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private Singleton() { }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public void doSomething() { /* ... */ }

}
