package com.example.firstplace.demoandroidapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
//import the PushIOManager library
import com.pushio.manager.PushIOActivityLauncher;
import com.pushio.manager.PushIOManager;
import com.pushio.manager.exception.ValidationException;
import com.pushio.manager.preferences.PushIOPreference;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Register device on push IO
        PushIOManager.getInstance(this).registerApp();
        //Register a know user on push IO
        PushIOManager.getInstance(this).registerUserId("9999999999999999999");
        PushIOManager.getInstance(this).getDeviceId();
        String getDeviceId = PushIOManager.getInstance(this).getDeviceId();
        System.out.println("getDeviceId=" + getDeviceId);
        setContentView(R.layout.activity_main);


    }

}
