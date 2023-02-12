package com.spbarber.todoapp.android.todoapp.domain

import com.spbarber.todoapp.android.todoapp.data.repository.TaskRepository
import com.spbarber.todoapp.android.todoapp.ui.model.Task
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTaskUseCase @Inject constructor(private val repository: TaskRepository) {

    operator fun invoke(): Flow<List<Task>> = repository.tasks

}