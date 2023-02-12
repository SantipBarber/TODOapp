package com.spbarber.todoapp.android.todoapp.data.repository

import com.spbarber.todoapp.android.todoapp.data.dao.TaskDao
import com.spbarber.todoapp.android.todoapp.data.entities.TaskEntity
import com.spbarber.todoapp.android.todoapp.ui.model.Task
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepository @Inject constructor(private val taskDao: TaskDao) {
    val tasks: Flow<List<Task>> = taskDao.find().map { items ->
        items.map { item ->
            Task(item.id, item.task, item.selected)
        }
    }

    suspend fun add(task:Task) {
        taskDao.addTask(TaskEntity(task.id, task.task, task.selected))
    }
}