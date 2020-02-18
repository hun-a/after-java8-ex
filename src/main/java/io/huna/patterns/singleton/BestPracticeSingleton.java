package io.huna.patterns.singleton;

/**
 * Hm... maybe best practice as known.
 * It could thread-safe and lazy loading.
 */
public class BestPracticeSingleton {

    private BestPracticeSingleton() { }

    public static BestPracticeSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static BestPracticeSingleton INSTANCE = new BestPracticeSingleton();
    }
}
