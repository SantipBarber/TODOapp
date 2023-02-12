package com.spbarber.todoapp.android.todoapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.spbarber.todoapp.android.todoapp.data.dao.TaskDao
import com.spbarber.todoapp.android.todoapp.data.entities.TaskEntity

@Database(entities = [TaskEntity::class], version = 1)
abstract class TodoDatabase: RoomDatabase() {
    abstract fun taskDao(): TaskDao
}