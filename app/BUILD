java_library(
    name = "main",
    srcs = glob(["src/main/java/**/*.java"]),
    resources = glob(["src/main/resources/**"]),
    deps = [
        "//annotations/time:annotations-time",
        "//utils/clock:clock",
    ],
    plugins = ["//:checker-plugin"],
    visibility = ["//visibility:public"],
)