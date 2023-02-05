package com.spbarber.todoapp.android.todoapp.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TaskViewModel_Factory implements Factory<TaskViewModel> {
  @Override
  public TaskViewModel get() {
    return newInstance();
  }

  public static TaskViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TaskViewModel newInstance() {
    return new TaskViewModel();
  }

  private static final class InstanceHolder {
    private static final TaskViewModel_Factory INSTANCE = new TaskViewModel_Factory();
  }
}
