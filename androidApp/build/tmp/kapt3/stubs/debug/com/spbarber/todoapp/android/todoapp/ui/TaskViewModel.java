package com.spbarber.todoapp.android.todoapp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.spbarber.todoapp.android.todoapp.data.model.Task;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/spbarber/todoapp/android/todoapp/ui/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_showDialog", "Landroidx/lifecycle/MutableLiveData;", "", "_tasks", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/spbarber/todoapp/android/todoapp/data/model/Task;", "showDialog", "Landroidx/lifecycle/LiveData;", "getShowDialog", "()Landroidx/lifecycle/LiveData;", "tasks", "", "getTasks", "()Ljava/util/List;", "dialogClose", "", "onCheckboxSelected", "task", "onItemRemove", "onShowDialogClick", "onTaskCreated", "", "androidApp_debug"})
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showDialog = null;
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.spbarber.todoapp.android.todoapp.data.model.Task> _tasks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.spbarber.todoapp.android.todoapp.data.model.Task> tasks = null;
    
    @javax.inject.Inject()
    public TaskViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.spbarber.todoapp.android.todoapp.data.model.Task> getTasks() {
        return null;
    }
    
    public final void dialogClose() {
    }
    
    public final void onTaskCreated(@org.jetbrains.annotations.NotNull()
    java.lang.String task) {
    }
    
    public final void onShowDialogClick() {
    }
    
    public final void onCheckboxSelected(@org.jetbrains.annotations.NotNull()
    com.spbarber.todoapp.android.todoapp.data.model.Task task) {
    }
    
    public final void onItemRemove(@org.jetbrains.annotations.NotNull()
    com.spbarber.todoapp.android.todoapp.data.model.Task task) {
    }
}