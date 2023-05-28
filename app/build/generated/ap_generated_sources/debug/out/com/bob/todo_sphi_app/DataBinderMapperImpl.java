package com.bob.todo_sphi_app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.bob.todo_sphi_app.databinding.ActivityAddOrEditTaskBindingImpl;
import com.bob.todo_sphi_app.databinding.ActivityAddOrEditTaskBindingLandImpl;
import com.bob.todo_sphi_app.databinding.ActivityTodoListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDOREDITTASK = 1;

  private static final int LAYOUT_ACTIVITYTODOLIST = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bob.todo_sphi_app.R.layout.activity_add_or_edit_task, LAYOUT_ACTIVITYADDOREDITTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bob.todo_sphi_app.R.layout.activity_todo_list, LAYOUT_ACTIVITYTODOLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADDOREDITTASK: {
          if ("layout/activity_add_or_edit_task_0".equals(tag)) {
            return new ActivityAddOrEditTaskBindingImpl(component, view);
          }
          if ("layout-land/activity_add_or_edit_task_0".equals(tag)) {
            return new ActivityAddOrEditTaskBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add_or_edit_task is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTODOLIST: {
          if ("layout/activity_todo_list_0".equals(tag)) {
            return new ActivityTodoListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_todo_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_add_or_edit_task_0", com.bob.todo_sphi_app.R.layout.activity_add_or_edit_task);
      sKeys.put("layout-land/activity_add_or_edit_task_0", com.bob.todo_sphi_app.R.layout.activity_add_or_edit_task);
      sKeys.put("layout/activity_todo_list_0", com.bob.todo_sphi_app.R.layout.activity_todo_list);
    }
  }
}
