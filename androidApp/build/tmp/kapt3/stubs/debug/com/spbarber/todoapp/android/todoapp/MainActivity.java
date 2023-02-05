package com.spbarber.todoapp.android.todoapp;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import com.spbarber.todoapp.android.todoapp.ui.TaskViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/spbarber/todoapp/android/todoapp/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "taskViewModel", "Lcom/spbarber/todoapp/android/todoapp/ui/TaskViewModel;", "getTaskViewModel", "()Lcom/spbarber/todoapp/android/todoapp/ui/TaskViewModel;", "taskViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "androidApp_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.activity.ComponentActivity {
    private final kotlin.Lazy taskViewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.spbarber.todoapp.android.todoapp.ui.TaskViewModel getTaskViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}