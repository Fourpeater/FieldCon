plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.fieldcon_ugale"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.fieldcon_ugale"
        minSdk = 26
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.activity.ktx)
    implementation(libs.appcompat)
    implementation(libs.cardview)
    implementation(libs.constraintlayout)
    implementation(libs.fragment)
    implementation(libs.legacy.support.v4)
    implementation(libs.material)
    implementation(libs.recyclerview)
    implementation(libs.viewpager2)
    testImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ext.junit)
}