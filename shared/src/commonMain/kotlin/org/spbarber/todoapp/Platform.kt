package org.spbarber.todoapp

expect val platform: String

class Greeting {
    fun greeting() = "Hello, $platform!"
}