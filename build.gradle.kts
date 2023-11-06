plugins {
    id("java")
}

group="fr.formiko.launcherjarexample"

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "fr.formiko.launcherjarexample.LauncherJarExample"
    }
}