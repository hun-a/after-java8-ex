package io.huna.patterns.singleton;

/**
 * It could resolve multi-thread problem by double-checked locking.
 * But it is not perfect.
 */
public class DclOldSchoolSingleton {

    private volatile static DclOldSchoolSingleton INSTANCE;

    private DclOldSchoolSingleton() { }

    public static DclOldSchoolSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DclOldSchoolSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DclOldSchoolSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
