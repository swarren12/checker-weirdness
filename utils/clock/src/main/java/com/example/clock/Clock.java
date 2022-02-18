package com.example.clock;

import com.example.annotations.Microseconds;
import com.example.annotations.Milliseconds;

/**
 * Retrieve the current time.
 */
public interface Clock {

    /**
     * Get the current time in milliseconds.
     *
     * @return the current time
     */
    @Milliseconds long currentTimeMillis();

    /**
     * Get the current time in microseconds.
     *
     * @return the current time
     */
    @Microseconds long currentTimeMicros();

}
