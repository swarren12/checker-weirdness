# Checker libs

remote_file(
    name = 'checker-framework-mvn',
    out = 'checker-framework.jar',
    url = 'https://repo1.maven.org/maven2/org/checkerframework/checker/3.21.2/checker-3.21.2.jar',
    sha1 = '4ea69950f90c9334295e997d5630229b5dcdc1a5',
)

remote_file(
    name = 'checker-qual-mvn',
    out = 'checker-qual.jar',
    url = 'https://repo1.maven.org/maven2/org/checkerframework/checker-qual/3.21.2/checker-qual-3.21.2.jar',
    sha1 = '630f15607e9850363c10c81283a65bfbce622146',
)

remote_file(
    name = 'checker-util-mvn',
    out = 'checker-util.jar',
    url = 'https://repo1.maven.org/maven2/org/checkerframework/checker-util/3.21.2/checker-util-3.21.2.jar',
    sha1 = 'ead8aae6c75bfa12618f7a88d6043273b8904263',
)

prebuilt_jar(
    name = 'checker-framework',
    binary_jar = ':checker-framework-mvn',
    deps = [
        ':checker-qual',
        ':checker-util',
    ],
    visibility = ['PUBLIC'],
)

prebuilt_jar(
    name = 'checker-qual',
    binary_jar = ':checker-qual-mvn',
    visibility = ['PUBLIC'],
)

prebuilt_jar(
    name = 'checker-util',
    binary_jar = ':checker-util-mvn',
    visibility = ['PUBLIC'],
)