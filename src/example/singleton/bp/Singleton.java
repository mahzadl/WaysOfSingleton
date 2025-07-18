package example.singleton.bp;

/**
 * @see example.singleton.pc
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
