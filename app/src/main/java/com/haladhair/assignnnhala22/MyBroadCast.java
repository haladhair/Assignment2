package com.haladhair.assignnnhala22;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyBroadCast extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
        MainActivity.setValues(level);
        throw new UnsupportedOperationException("Not yet implemented");

    }
}
