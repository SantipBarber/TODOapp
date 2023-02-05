package com.spbarber.todoapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform