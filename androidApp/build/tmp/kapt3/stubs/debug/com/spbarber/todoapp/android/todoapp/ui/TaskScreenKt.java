package com.spbarber.todoapp.android.todoapp.ui;

import androidx.compose.foundation.layout.*;
import androidx.compose.material.*;
import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import com.spbarber.todoapp.android.todoapp.data.model.Task;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0007\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0007\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u0013"}, d2 = {"AddTaskDialog", "", "show", "", "onDismiss", "Lkotlin/Function0;", "onTaskAdded", "Lkotlin/Function1;", "", "FabDialog", "modifier", "Landroidx/compose/ui/Modifier;", "taskViewModel", "Lcom/spbarber/todoapp/android/todoapp/ui/TaskViewModel;", "ItemTask", "task", "Lcom/spbarber/todoapp/android/todoapp/data/model/Task;", "TaskList", "TaskScreen", "androidApp_debug"})
public final class TaskScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TaskScreen(@org.jetbrains.annotations.NotNull()
    com.spbarber.todoapp.android.todoapp.ui.TaskViewModel taskViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TaskList(@org.jetbrains.annotations.NotNull()
    com.spbarber.todoapp.android.todoapp.ui.TaskViewModel taskViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ItemTask(@org.jetbrains.annotations.NotNull()
    com.spbarber.todoapp.android.todoapp.data.model.Task task, @org.jetbrains.annotations.NotNull()
    com.spbarber.todoapp.android.todoapp.ui.TaskViewModel taskViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void FabDialog(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.spbarber.todoapp.android.todoapp.ui.TaskViewModel taskViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AddTaskDialog(boolean show, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTaskAdded) {
    }
}