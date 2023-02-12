package com.spbarber.todoapp.android.todoapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.spbarber.todoapp.android.todoapp.data.entities.TaskEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface TaskDao {
    @Query("SELECT * FROM TaskEntity")
    fun find(): Flow<List<TaskEntity>>

    @Insert
    suspend fun addTask(item: TaskEntity)
}