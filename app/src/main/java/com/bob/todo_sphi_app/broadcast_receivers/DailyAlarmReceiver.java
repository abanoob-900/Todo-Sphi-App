package com.bob.todo_sphi_app.broadcast_receivers;

import com.bob.todo_sphi_app.services.DueCheckIntentService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DailyAlarmReceiver extends BroadcastReceiver {
    public static final int REQUEST_CODE = 1201;
    public static final String ACTION = "com.bob.todo_sphi_app.alarm";

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent dueCheckIntent = new Intent(context, DueCheckIntentService.class);
        dueCheckIntent.putExtra("foo", "bar");
        context.startService(dueCheckIntent);
    }
}
