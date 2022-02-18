package com.example.clock;

import com.example.annotations.Microseconds;
import com.example.annotations.Milliseconds;
import com.example.annotations.Time;

/**
 * A {@link Clock} that uses the {@link System} time.
 */
public class SystemClock implements Clock {

    @Override
    public @Milliseconds long currentTimeMillis() {
        return Time.millis(System.currentTimeMillis());
    }

    @Override
    public @Microseconds long currentTimeMicros() {
        return Time.micros(System.nanoTime() / 1000);
    }

}
