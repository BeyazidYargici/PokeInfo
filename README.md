# PokeInfo (Under Construction)
Android App with MVVM, Architecture Components (ViewModel, LiveData, Navigation, Room), Dependency Injection (Dagger2), Kotlin Coroutines


Libraries

## Dependency Injection with Dagger2
    implementation "com.google.dagger: dagger:2.20"
    implementation "com.google.dagger:dagger-android:2.20"
    implementation 'com.google.dagger:dagger-android-support:2.20'
    kapt "com.google.dagger:dagger-compiler:2.20"
    kapt "com.google.dagger:dagger-android-processor:2.20"

## Lifecycle
    $lifecycle_version='2.0.0'
    implementation "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    kapt "androidx.lifecycle:lifecycle-compiler:$lifecycle_version"

## Kotlin Android Coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.1.0'
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.1.0"
    
## Navigation
    implementation "android.arch.navigation:navigation-fragment:1.0.0-alpha09"
    implementation "android.arch.navigation:navigation-ui:1.0.0-alpha09"
    implementation "android.arch.navigation:navigation-fragment-ktx:1.0.0-alpha09"
    implementation "android.arch.navigation:navigation-ui-ktx:1.0.0-alpha09"
