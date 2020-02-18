package io.huna.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldSchoolSingletonTest {

    private OldSchoolSingleton oldSchool;

    @Test
    public void testOldSchoolSingleton() {
        Runnable r = () -> {
            oldSchool = OldSchoolSingleton.getInstance();
            assertTrue(oldSchool.isOldSchool());
            oldSchool.dressUp();
            assertFalse(oldSchool.isOldSchool());
        };

        Thread[] threads = new Thread[10];

        for (Thread t: threads) {
            t = new Thread(r);
            t.run();
        }
    }
}