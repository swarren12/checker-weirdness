# Checker Weirdness

This simple project demonstrates Bazel and Checker Framework do play nicely together.

There are no explicit instructions for Bazel from what I can see, but it's similar enough to Buck.
See https://checkerframework.org/manual/#buck for the basic template followed.

## Building

The project can be built by running the following command:

```shell
./bazel fetch //... && ./bazel build //app:main
```

## Expected Behaviour

It is expected that the project builds.

## Actual Behaviour

The project actually builds (hurrah!).