import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val arrow_version = "0.9.0"
val spek_version = "2.0.1"

plugins {
    kotlin("jvm") version "1.3.21"
    kotlin("kapt") version "1.3.21"
}

group = "com.agustibm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation(kotlin("test"))
    implementation(kotlin("test-junit"))

    // Arrow
    compile("io.arrow-kt:arrow-core-data:$arrow_version")
    compile("io.arrow-kt:arrow-core-extensions:$arrow_version")
    compile("io.arrow-kt:arrow-syntax:$arrow_version")
    compile("io.arrow-kt:arrow-typeclasses:$arrow_version")
    compile("io.arrow-kt:arrow-extras-data:$arrow_version")
    compile("io.arrow-kt:arrow-extras-extensions:$arrow_version")
    kapt("io.arrow-kt:arrow-meta:$arrow_version")

    // Spek
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:$spek_version")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:$spek_version")

    // Kotlintest
    testCompile("io.kotlintest:kotlintest-core:3.1.0-RC2")
    testCompile("io.kotlintest:kotlintest-assertions:3.1.0-RC2")
    testCompile("io.kotlintest:kotlintest-runner-junit5:3.1.0-RC2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test> {
    useJUnitPlatform {
        includeEngines("spek2")
    }
}