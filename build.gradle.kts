plugins {
    id("org.jetbrains.jewel.kotlin") apply false
    alias(libs.plugins.composeDesktop) apply false
    alias(libs.plugins.ideaGradlePlugin) apply false
    alias(libs.plugins.kotlinSerialization) apply false
    id("org.jetbrains.jewel.detekt")
    id("org.jetbrains.jewel.ktlint")
}


allprojects {
    group = "org.jetbrains.jewel"
    version = "0.1-SNAPSHOT"

    // TODO do we still need this? See issue #24
    configurations.all {
        resolutionStrategy.dependencySubstitution {
            substitute(module("org.jetbrains.compose.compiler:compiler")).apply {
                using(module("androidx.compose.compiler:compiler:1.2.1-dev-k1.7.10-27cf0868d10"))
            }
        }
    }
}
