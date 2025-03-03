plugins {
    kotlin("jvm") version "2.0.0"
    application
}

group = "com.github.tacticallaptopbag.mail_blaster"
version = "1.0"

repositories {
    mavenCentral()
}

application {
    mainClass = "com.github.tacticallaptopbag.mail_blaster.MainKt"
}

dependencies {
    // Discord JDA
    // https://github.com/discord-jda/JDA
    implementation("net.dv8tion:JDA:5.2.2") {
        exclude(module="opus-java")
    }
    // SLF4J Logging backend
    implementation("ch.qos.logback:logback-classic:1.5.6")

    // Apache Email
    // https://gist.github.com/BlackthornYugen/1b3e1ff4426294e7054c9a7190e8f2cd
    implementation("org.apache.commons:commons-email:1.5")

    // AppDirs
    // https://github.com/harawata/appdirs
    implementation("net.harawata:appdirs:1.3.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}