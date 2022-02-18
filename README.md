# Checker Weirdness

This simple project demonstrates Buck and Checker Framework not playing nicely together.

See https://checkerframework.org/manual/#buck for the basic template followed.

## Pre-requisites

It is assumed that Apache Ant, Python (ideally >=3, <3.10) and JDK11 are installed and configured on the system.
The `buck` binary is too large to be committed as part of the repository; it must be built by running `./build-buck`.

## Building

The project can be built by running the following command:

```shell
./buck fetch //... && ./buck build //app:main
```

## Expected Behaviour

It is expected that the project builds.

## Actual Behaviour

The project fails to build with the following error:

```
Command failed with exit code 1.

stderr: app/src/main/java/com/example/Main.java:11: error: [conflicting.annos] invalid type: conflicting annotations [@s(Prefix.milli), @s(Prefix.milli)] in type "@s(Prefix.milli) @s(Prefix.milli) long"
        final @Milliseconds long time = clock.currentTimeMillis();
                                                               ^
Errors: 1. Warnings: 0.

    When running <javac>.
    When building rule //app:main.
```