package com.example.annotations;

/**
 * Helper class for blessing {@link Milliseconds} or {@link Microseconds}.
 */
public final class Time {

    /**
     * Bless the given time as {@link Milliseconds}.
     *
     * @param millis the time
     * @return the time
     */
    public static @Milliseconds long millis(long millis) {
        return millis;
    }

    /**
     * Bless the given time as {@link Microseconds}.
     *
     * @param micros the time
     * @return the time
     */
    public static @Microseconds long micros(long micros) {
        return micros;
    }

}
