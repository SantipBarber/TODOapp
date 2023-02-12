package com.spbarber.todoapp.android.todoapp.ui.model

data class Task(
    val id: Int = System.currentTimeMillis().hashCode(),
    val task: String,
    var selected: Boolean = false
)
