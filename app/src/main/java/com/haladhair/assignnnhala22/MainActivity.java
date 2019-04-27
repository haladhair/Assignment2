package com.haladhair.assignnnhala22;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static SeekBar seekbar;
    static TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t=findViewById(R.id.bat1);
        SeekBar seekbar =findViewById(R.id.s1);
        MyBroadCast myBroadCast= new MyBroadCast();
        this.registerReceiver(myBroadCast,
                new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }
    public  static void setValues(int level ){
        t.setText(level + "%");
        seekbar.setProgress(level);
        seekbar.setMax(100);

    }
}
