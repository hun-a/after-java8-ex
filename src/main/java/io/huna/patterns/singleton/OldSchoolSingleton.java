package io.huna.patterns.singleton;

import lombok.ToString;

/**
 * This class have the critical problem when multi-thread environment
 */
@ToString
public class OldSchoolSingleton {

    private static OldSchoolSingleton INSTANCE;

    private OldSchoolSingleton() { }

    public static OldSchoolSingleton getInstance() {
        if (INSTANCE == null) {
            // <<- Here!! It could make more instances here!
            INSTANCE = new OldSchoolSingleton();
        }
        return INSTANCE;
    }
}
