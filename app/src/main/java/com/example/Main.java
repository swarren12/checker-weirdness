package com.example;

import com.example.annotations.Milliseconds;
import com.example.clock.Clock;
import com.example.clock.SystemClock;

public class Main {

    public static void main(String[] args) {
        final Clock clock = new SystemClock();
        final @Milliseconds long time = clock.currentTimeMillis();
        System.out.println("The current time is: " + time);
    }

}