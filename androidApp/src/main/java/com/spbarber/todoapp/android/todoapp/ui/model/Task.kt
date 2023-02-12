package com.spbarber.todoapp.android.todoapp.ui.model

data class Task(
    val id: Long = System.currentTimeMillis(),
    val task: String,
    var selected: Boolean = false
)
