import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.coopsrc.matrix"
version = "1.0.0"


kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "17"
        }
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(compose.desktop.currentOs)
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Readable"
            packageVersion = "1.0.0"

            val iconsRoot = project.file("../shared/src/desktopMain/resources/icons")

            macOS {
                iconFile.set(iconsRoot.resolve("icon-mac.icns"))
            }

            windows {
                iconFile.set(iconsRoot.resolve("icon-windows.ico"))
                menuGroup = "Coopsrc Matrix"
                // see https://wixtoolset.org/documentation/manual/v3/howtos/general/generate_guids.html
                upgradeUuid = "45458671-9a67-4ad0-9d0d-537c9fb74716"
            }
            linux {
                iconFile.set(iconsRoot.resolve("icon-linux.png"))
            }
        }
    }
}
