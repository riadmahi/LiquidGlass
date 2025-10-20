package com.riadmahi.liquidglass

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform