package com.example.allisonreiss.hark;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by veronica.lin1218 on 11/29/2017.
 */

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {
        AlarmActivity inst = AlarmActivity.instance();

        // update UI with message
        //inst.setAlarmText("Reminder!!");
        // sent notification
    }
}
