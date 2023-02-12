package com.spbarber.todoapp.android.todoapp.data.model

data class Task(
    val id: Long = System.currentTimeMillis(),
    val task: String,
    var selected: Boolean = false
)
