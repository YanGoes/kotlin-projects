plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "br.com.exemplo.catalogodelivros"
    compileSdk = 35

    defaultConfig {
        applicationId = "br.com.exemplo.catalogodelivros"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.recyclerview)
}