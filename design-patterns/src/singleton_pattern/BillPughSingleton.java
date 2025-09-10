package singleton_pattern;

// bill pugh singleton
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class Holer {
        // Suppressing warning: This is a Singleton, not a utility class.
        private static final BillPughSingleton SINGLETON = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Holer.SINGLETON;
    }
}
