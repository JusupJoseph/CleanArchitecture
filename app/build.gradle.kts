plugins {
    id ("com.android.application")
    kotlin("android")

    // Kapt
    kotlin("kapt")

    // Hilt
    id("com.google.dagger.hilt.android")

    // Safe Args
    id("androidx.navigation.safeargs")
}

android {
    namespace = "com.example.cleanarchitecture"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.cleanarchitecture"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    // ViewBinding
    buildFeatures.viewBinding = true

}


dependencies {

    // Core
    implementation ("androidx.core:core-ktx:1.7.0")

    // AppCompat
    implementation ("androidx.appcompat:appcompat:1.5.1")

    // Material
    implementation ("com.google.android.material:material:1.7.0")

    // ConstraintLayout
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation ("junit:junit:4.13.2")

    // NavComponents
    val nav_version = "2.5.3"
    implementation("androidx.navigation:navigation-fragment:$nav_version")
    implementation("androidx.navigation:navigation-ui:$nav_version")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")
}