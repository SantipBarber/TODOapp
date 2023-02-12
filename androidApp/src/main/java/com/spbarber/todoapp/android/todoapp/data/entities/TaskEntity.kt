package com.spbarber.todoapp.android.todoapp.data.entities

import androidx.room.PrimaryKey

data class TaskEntity(
    @PrimaryKey
    val id: Int,
    val task: String,
    val selected: Boolean = false
)
