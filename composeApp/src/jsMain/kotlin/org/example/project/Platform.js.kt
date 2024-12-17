package org.example.project

class JSPlatform : Platform {
    override val name: String = "Kotlin JS/IR platform"
}

actual fun getPlatform(): Platform = JSPlatform()
