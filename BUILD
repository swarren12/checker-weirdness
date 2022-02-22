# Checker libs

java_library(
    name = "checker-framework",
    exports = [
        "@maven//:org_checkerframework_checker",
        "@maven//:org_checkerframework_checker_qual",
        "@maven//:org_checkerframework_checker_util",
    ],
    visibility = ["//visibility:public"],
)

java_library(
    name = "checker-qual",
    exports = ["@maven//:org_checkerframework_checker_qual"],
    visibility = ["//visibility:public"],
)

java_plugin(
    name = "checker-plugin",
    processor_class = "org.checkerframework.checker.units.UnitsChecker",
    deps = [":checker-framework"],
    visibility = ["//visibility:public"],
)