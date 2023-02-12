package com.spbarber.todoapp.android.todoapp.ui

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.geometry.Offset
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.spbarber.todoapp.android.todoapp.data.model.Task
import javax.inject.Inject

class TaskViewModel @Inject constructor(): ViewModel() {

    private val _showDialog = MutableLiveData<Boolean>()
    val showDialog: LiveData<Boolean> = _showDialog

    private val _tasks= mutableStateListOf<Task>()
    val tasks: List<Task> = _tasks
    fun dialogClose() {
        _showDialog.value = false
    }

    fun onTaskCreated(task: String) {
        _showDialog.value = false
        _tasks.add(Task(task = task))
    }

    fun onShowDialogClick() {
        _showDialog.value = true
    }

    fun onCheckboxSelected(task: Task) {
        val index = _tasks.indexOf(task)
        _tasks[index] = _tasks[index].let {
            it.copy(selected = !it.selected)
        }
    }

    fun onItemRemove(task: Task) {
        val taskToRemove = _tasks.find { it.id == task.id }
        _tasks.remove(taskToRemove)
    }


}