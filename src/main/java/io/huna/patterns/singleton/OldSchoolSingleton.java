package io.huna.patterns.singleton;

import lombok.ToString;

/**
 * This class have the critical problem when multi-thread environment
 */
@ToString
public class OldSchoolSingleton {

    private static OldSchoolSingleton INSTANCE;
    private boolean isOldSchool;

    private OldSchoolSingleton() {
        isOldSchool = true;
    }

    public static OldSchoolSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new OldSchoolSingleton();
        }
        return INSTANCE;
    }

    public boolean isOldSchool() {
        return isOldSchool;
    }

    public void dressUp() {
        isOldSchool = false;
    }
}
