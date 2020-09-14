pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}

plugins {
  id("com.gradle.enterprise").version("3.4.1")
}

include("simple")
include("dagger-kapt")

includeBuild("doctor-plugin")

