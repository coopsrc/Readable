package com.coopsrc.matrix.readable

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform