package com.spbarber.todoapp.android.todoapp.domain

import com.spbarber.todoapp.android.todoapp.data.repository.TaskRepository
import com.spbarber.todoapp.android.todoapp.ui.model.Task
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val repository: TaskRepository) {

    suspend operator fun invoke(task: Task) = repository.add(task)
}