package com.bob.todo_sphi_app.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class TodoListWidgetRemoteViewsService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new TodoListWidgetRemoteViewsFactory(this.getApplicationContext(), intent);
    }
}
